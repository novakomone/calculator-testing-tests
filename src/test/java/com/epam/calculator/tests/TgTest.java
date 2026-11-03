
package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TgTest {

    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        calculator = null;
    }

    @DataProvider(name = "tgData")
    public Object[][] tgData() {
        return new Object[][] {
                {0.0, 0.0},
                {Math.PI / 4, 1.0},
                {-Math.PI / 4, -1.0},
                {Math.PI, 0.0}
        };
    }

    @Test(dataProvider = "tgData", groups = "trigonometry")
    public void testTg(double input, double expected) {
        assertEquals(calculator.tg(input), expected, 1e-9);
    }
}
