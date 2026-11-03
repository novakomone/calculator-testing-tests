
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class SqrtTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "sqrtData", groups = "math")
    public void testSqrt(double input, double expected) {
        Assert.assertEquals(calculator.sqrt(input), expected, 0.000001);
    }

    @DataProvider(name = "sqrtData")
    public Object[][] provideSqrtData() {
        return new Object[][] {
                {0.0, 0.0},
                {4.0, 2.0},
                {9.0, 3.0},
                {2.0, Math.sqrt(2.0)}
        };
    }
}
