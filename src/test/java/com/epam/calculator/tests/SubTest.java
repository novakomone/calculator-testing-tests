
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class SubTest {

    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        calculator = null;
    }

    @Test(dataProvider = "subData", groups = "arithmetic")
    public void testSub(long a, long b, long expected) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "subData")
    public Object[][] provideSubData() {
        return new Object[][] {
                {10L, 3L, 7L},
                {3L, 10L, -7L},
                {-5L, -3L, -2L},
                {0L, 0L, 0L},
                {Long.MIN_VALUE, 0L, Long.MIN_VALUE}
        };
    }
    @Test(dataProvider = "subDoubleData", groups = "arithmetic")
    public void testSubDouble(double a, double b, double expected) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expected, 0.000001);
    }

    @DataProvider(name = "subDoubleData")
    public Object[][] provideSubDoubleData() {
        return new Object[][] {
                {10.5, 3.2, 7.3},
                {3.2, 10.5, -7.3},
                {-5.5, -3.2, -2.3},
                {0.0, 0.0, 0.0},
                {1.5, 0.5, 1.0},
                {-2.5, 1.5, -4.0}
        };
    }
}
