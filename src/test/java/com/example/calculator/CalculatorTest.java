package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-2, 2));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(-5, calc.subtract(0, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(0, 100));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }

    @Test
    void testAreaOfCircle() {
        assertEquals(Math.PI * 1 * 1, calc.areaOfCircle(1));
        assertEquals(Math.PI * 4 * 4, calc.areaOfCircle(4), 0.0001);
        assertEquals(Math.PI * 5 * 5, calc.areaOfCircle(5), 0.0001);
        assertEquals(0, calc.areaOfCircle(0));
    }

    @Test
    void testAreaOfCircleWithDecimal() {
        assertEquals(Math.PI * 2.5 * 2.5, calc.areaOfCircle(2.5), 0.0001);
        assertEquals(Math.PI * 0.5 * 0.5, calc.areaOfCircle(0.5), 0.0001);
    }

    @Test
    void testAreaOfCircleNegativeRadiusThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.areaOfCircle(-5));
        assertThrows(IllegalArgumentException.class, () -> calc.areaOfCircle(-1.5));
    }
}
