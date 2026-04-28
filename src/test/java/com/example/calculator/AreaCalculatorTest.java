package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    private final AreaCalculator areaCalc = new AreaCalculator();

    // ── Rectangle ──────────────────────────────────────────────────────────────

    @Test
    void testAreaOfRectangle() {
        assertEquals(12.0, areaCalc.areaOfRectangle(3, 4));
        assertEquals(20.0, areaCalc.areaOfRectangle(4, 5));
        assertEquals(0.0,  areaCalc.areaOfRectangle(0, 5));
        assertEquals(0.0,  areaCalc.areaOfRectangle(3, 0));
    }

    @Test
    void testAreaOfRectangleWithDecimals() {
        assertEquals(7.5,  areaCalc.areaOfRectangle(2.5, 3),   0.0001);
        assertEquals(1.5,  areaCalc.areaOfRectangle(1.5, 1),   0.0001);
        assertEquals(6.25, areaCalc.areaOfRectangle(2.5, 2.5), 0.0001);
    }

    @Test
    void testAreaOfRectangleNegativeDimensionsThrows() {
        assertThrows(IllegalArgumentException.class, () -> areaCalc.areaOfRectangle(-3, 4));
        assertThrows(IllegalArgumentException.class, () -> areaCalc.areaOfRectangle(3, -4));
        assertThrows(IllegalArgumentException.class, () -> areaCalc.areaOfRectangle(-3, -4));
    }

    // ── Triangle ───────────────────────────────────────────────────────────────

    @Test
    void testAreaOfTriangle() {
        assertEquals(6.0,  areaCalc.areaOfTriangle(3, 4));
        assertEquals(10.0, areaCalc.areaOfTriangle(4, 5));
        assertEquals(0.0,  areaCalc.areaOfTriangle(0, 5));
        assertEquals(0.0,  areaCalc.areaOfTriangle(3, 0));
    }

    @Test
    void testAreaOfTriangleWithDecimals() {
        assertEquals(3.75,  areaCalc.areaOfTriangle(2.5, 3),   0.0001);
        assertEquals(0.75,  areaCalc.areaOfTriangle(1.5, 1),   0.0001);
        assertEquals(3.125, areaCalc.areaOfTriangle(2.5, 2.5), 0.0001);
    }

    @Test
    void testAreaOfTriangleNegativeDimensionsThrows() {
        assertThrows(IllegalArgumentException.class, () -> areaCalc.areaOfTriangle(-3, 4));
        assertThrows(IllegalArgumentException.class, () -> areaCalc.areaOfTriangle(3, -4));
        assertThrows(IllegalArgumentException.class, () -> areaCalc.areaOfTriangle(-3, -4));
    }

    // ── Circle ─────────────────────────────────────────────────────────────────

    @Test
    void testAreaOfCircle() {
        assertEquals(Math.PI * 4,  areaCalc.areaOfCircle(2),   0.0001);
        assertEquals(Math.PI * 25, areaCalc.areaOfCircle(5),   0.0001);
        assertEquals(0.0,          areaCalc.areaOfCircle(0));
    }

    @Test
    void testAreaOfCircleWithDecimalRadius() {
        assertEquals(Math.PI * 2.5 * 2.5, areaCalc.areaOfCircle(2.5), 0.0001);
    }

    @Test
    void testAreaOfCircleNegativeRadiusThrows() {
        assertThrows(IllegalArgumentException.class, () -> areaCalc.areaOfCircle(-1));
    }
}
