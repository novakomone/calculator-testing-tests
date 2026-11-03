
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
}
