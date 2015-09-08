package calculator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testCalculate() throws Exception {
        assertEquals(2d, calculator.calculate("(2 + 2) / 4 + 1"), 1e-9);
    }

    @Test
    public void functionTest() {
        assertEquals(1d, calculator.calculate("sin(1)*sin(1) + cos(1)*cos(1)"), 1e-9);
    }
}