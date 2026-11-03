
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class PowTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "powData", groups = "math")
    public void testPow(double base, double exponent, double expected) {
        Assert.assertEquals(calculator.pow(base, exponent), expected, 0.000001);
    }

    @DataProvider(name = "powData")
    public Object[][] providePowData() {
        return new Object[][] {
                {2.0, 3.0, 8.0},
                {5.0, 0.0, 1.0},
                {2.0, -2.0, 0.25},
                {-2.0, 3.0, -8.0}
        };
    }
}
