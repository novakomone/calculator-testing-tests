
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
}
