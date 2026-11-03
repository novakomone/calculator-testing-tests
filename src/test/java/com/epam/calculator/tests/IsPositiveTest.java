
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class IsPositiveTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "positiveData", groups = "validation")
    public void testIsPositive(long input, boolean expected) {
        Assert.assertEquals(calculator.isPositive(input), expected);
    }

    @DataProvider(name = "positiveData")
    public Object[][] providePositiveData() {
        return new Object[][] {
                {1L, true},
                {-1L, false},
                {0L, false},
                {Long.MAX_VALUE, true},
                {Long.MIN_VALUE, false}
        };
    }
}
