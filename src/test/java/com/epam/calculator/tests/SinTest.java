
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class SinTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "sinData", groups = "trigonometry")
    public void testSin(double input, double expected) {
        Assert.assertEquals(calculator.sin(input), expected, 0.000001);
    }

    @DataProvider(name = "sinData")
    public Object[][] provideSinData() {
        return new Object[][] {
                {0.0, 0.0},
                {Math.PI / 2, 1.0},
                {Math.PI, 0.0},
                {-Math.PI / 2, -1.0}
        };
    }
}
