
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest {

    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        calculator = null;
    }

    @Test(dataProvider = "divData", groups = "arithmetic")
    public void testDiv(long a, long b, long expected) {
        Assert.assertEquals(calculator.div(a, b), expected);
    }

    @DataProvider(name = "divData")
    public Object[][] provideDivData() {
        return new Object[][] {
                {10L, 2L, 5L},
                {9L, 2L, 4L},
                {-10L, 2L, -5L},
                {-9L, 2L, -4L},
                {0L, 5L, 0L}
        };
    }

    @Test(
            expectedExceptions = NumberFormatException.class,
            expectedExceptionsMessageRegExp = "Attempt to divide by zero",
            groups = "arithmetic"
    )
    public void testDivisionByZero() {
        calculator.div(10L, 0L);
    }
}
