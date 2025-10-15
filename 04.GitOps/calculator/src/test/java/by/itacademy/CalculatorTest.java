package by.itacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-2.0, calculator.divide(6, -3));
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    public void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertTrue(calculator.isEven(0));
        assertFalse(calculator.isEven(3));
        assertFalse(calculator.isEven(-5));
    }

    @Test
    public void testReverseString() {
        assertEquals("123", calculator.reverseString("321"));
        assertEquals("", calculator.reverseString(""));
        assertEquals("2", calculator.reverseString("2"));
        assertNull(calculator.reverseString(null));
    }
}