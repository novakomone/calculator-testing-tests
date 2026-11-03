
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CosTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "cosData", groups = "trigonometry")
    public void testCos(double input, double expected) {
        Assert.assertEquals(calculator.cos(input), expected, 0.000001);
    }

    @DataProvider(name = "cosData")
    public Object[][] provideCosData() {
        return new Object[][] {
                {0.0, 1.0},
                {Math.PI / 2, 0.0},
                {Math.PI, -1.0},
                {2 * Math.PI, 1.0}
        };
    }
}
