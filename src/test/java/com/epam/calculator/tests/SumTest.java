package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class SumTest {
    private Calculator calculator;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "sumData", groups = "arithmetic")
    public void testSum(long a, long b, long expected) {

        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sumData")
    public Object[][]
    provideSumData() {
        return new Object[][]{
                {5L, 3L, 8L},
                {-5L, -3L, -8L},
                {-5L, 3L, -2L},
                {0L, 10L, 10L},
                {0L, 0L, 0L},
                {Long.MAX_VALUE, 0L, Long.MAX_VALUE},
                {Long.MIN_VALUE, 0L, Long.MIN_VALUE},
                {Long.MAX_VALUE, 1L, Long.MIN_VALUE},
                {Long.MIN_VALUE, -1L, Long.MAX_VALUE},
        };
    }

    @Test(dataProvider = "doubleSumData", groups = "arithmetic")
    public void testSumDouble(double a, double b, double expected) {

        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expected, 0.000001);
    }


    @DataProvider(name = "doubleSumData")
    public Object[][]
    provideDoubleSumData() {
        return new Object[][]{
                {2.5, 3.7, 6.2},
                {-2.5, -3.7, -6.2},
                {-2.5, 3.7, 1.2},
                {0.0, 5.5, 5.5},
                {0.1, 0.2, 0.3},

        };
    }

}




