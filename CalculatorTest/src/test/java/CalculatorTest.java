import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2,3));
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.subtract(40, 20));
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(100, calc.multiply(10,10));
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(10, 5));

    }
}