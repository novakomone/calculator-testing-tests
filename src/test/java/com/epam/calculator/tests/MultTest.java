
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class MultTest {

    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        calculator = null;
    }

    @Test(dataProvider = "multData", groups = "arithmetic")
    public void testMult(long a, long b, long expected) {
        Assert.assertEquals(calculator.mult(a, b), expected);
    }

    @DataProvider(name = "multData")
    public Object[][] provideMultData() {
        return new Object[][] {
                {5L, 3L, 15L},
                {-5L, 3L, -15L},
                {-5L, -3L, 15L},
                {0L, 100L, 0L},
                {Long.MAX_VALUE, 1L, Long.MAX_VALUE}
        };
    }

    @Test(dataProvider = "multDoubleData", groups = "arithmetic")
    public void testMultDouble(double a, double b, double expected) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, 0.000001);
    }

    @DataProvider(name = "multDoubleData")
    public Object[][] provideMultDoubleData() {
        return new Object[][] {
                {2.5, 4.0, 10.0},
                {-2.5, 4.0, -10.0},
                {-2.5, -4.0, 10.0},
                {0.0, 5.7, 0.0},
                {0.1, 0.2, 0.02},
                {1.5, 2.5, 3.75}
        };
    }
}
