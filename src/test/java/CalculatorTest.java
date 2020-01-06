import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(10.00, calculator.add(5.00, 5.00), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(10.00, calculator.subtract(15.00, 5.00), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(100.00, calculator.multiply(10.00, 10.00), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(10.00, calculator.divide(100.00, 10.00), 0.01);
    }
}
