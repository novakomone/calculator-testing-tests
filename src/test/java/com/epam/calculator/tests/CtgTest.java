
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CtgTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "ctgData", groups = "trigonometry")
    public void testCtg(double input, double expected) {
        Assert.assertEquals(calculator.ctg(input), expected, 0.000001);
    }

    @DataProvider(name = "ctgData")
    public Object[][] provideCtgData() {
        return new Object[][] {
                {Math.PI / 4, 1.0},
                {Math.PI / 2, 0.0},
                {3 * Math.PI / 4, -1.0}
        };
    }
}
