
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class IsNegativeTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "negativeData", groups = "validation")
    public void testIsNegative(long input, boolean expected) {
        Assert.assertEquals(calculator.isNegative(input), expected);
    }

    @DataProvider(name = "negativeData")
    public Object[][] provideNegativeData() {
        return new Object[][] {
                {1L, false},
                {-1L, true},
                {0L, false},
                {Long.MAX_VALUE, false},
                {Long.MIN_VALUE, true}
        };
    }
}
