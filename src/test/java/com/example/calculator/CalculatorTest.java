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
    void testAreaOfRectangle() {
        assertEquals(12, calc.areaOfRectangle(3, 4));
        assertEquals(20, calc.areaOfRectangle(4, 5));
        assertEquals(0, calc.areaOfRectangle(0, 5));
        assertEquals(0, calc.areaOfRectangle(3, 0));
    }

    @Test
    void testAreaOfRectangleWithDecimals() {
        assertEquals(7.5, calc.areaOfRectangle(2.5, 3), 0.0001);
        assertEquals(1.5, calc.areaOfRectangle(1.5, 1), 0.0001);
        assertEquals(6.25, calc.areaOfRectangle(2.5, 2.5), 0.0001);
    }

    @Test
    void testAreaOfRectangleNegativeDimensionsThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.areaOfRectangle(-3, 4));
        assertThrows(IllegalArgumentException.class, () -> calc.areaOfRectangle(3, -4));
        assertThrows(IllegalArgumentException.class, () -> calc.areaOfRectangle(-3, -4));
    }
}