package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    private final AreaCalculator calculator = new AreaCalculator();

    @Test
    void testAreaOfRectangle() {
        assertEquals(12, calculator.areaOfRectangle(3, 4));
        assertEquals(20, calculator.areaOfRectangle(4, 5));
        assertEquals(0, calculator.areaOfRectangle(0, 5));
        assertEquals(0, calculator.areaOfRectangle(3, 0));
    }

    @Test
    void testAreaOfRectangleWithDecimals() {
        assertEquals(7.5, calculator.areaOfRectangle(2.5, 3), 0.0001);
        assertEquals(1.5, calculator.areaOfRectangle(1.5, 1), 0.0001);
        assertEquals(6.25, calculator.areaOfRectangle(2.5, 2.5), 0.0001);
    }

    @Test
    void testAreaOfRectangleNegativeDimensionsThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.areaOfRectangle(-3, 4));
        assertThrows(IllegalArgumentException.class, () -> calculator.areaOfRectangle(3, -4));
        assertThrows(IllegalArgumentException.class, () -> calculator.areaOfRectangle(-3, -4));
    }

    @Test
    void testAreaOfTriangle() {
        assertEquals(6, calculator.areaOfTriangle(3, 4));
        assertEquals(10, calculator.areaOfTriangle(4, 5));
        assertEquals(0, calculator.areaOfTriangle(0, 5));
        assertEquals(0, calculator.areaOfTriangle(3, 0));
    }

    @Test
    void testAreaOfTriangleWithDecimals() {
        assertEquals(3.75, calculator.areaOfTriangle(2.5, 3), 0.0001);
        assertEquals(0.75, calculator.areaOfTriangle(1.5, 1), 0.0001);
        assertEquals(3.125, calculator.areaOfTriangle(2.5, 2.5), 0.0001);
    }

    @Test
    void testAreaOfTriangleNegativeDimensionsThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.areaOfTriangle(-3, 4));
        assertThrows(IllegalArgumentException.class, () -> calculator.areaOfTriangle(3, -4));
        assertThrows(IllegalArgumentException.class, () -> calculator.areaOfTriangle(-3, -4));
    }
}
