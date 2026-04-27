package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    private final ShapeCalculator shapeCalculator = new ShapeCalculator();

    @Test
    void testSquareArea() {
        assertEquals(25.0, shapeCalculator.squareArea(5));
        assertEquals(0.0, shapeCalculator.squareArea(0));
        assertEquals(2.25, shapeCalculator.squareArea(1.5));
    }

    @Test
    void testSquarePerimeter() {
        assertEquals(20.0, shapeCalculator.squarePerimeter(5));
        assertEquals(0.0, shapeCalculator.squarePerimeter(0));
        assertEquals(6.0, shapeCalculator.squarePerimeter(1.5));
    }

    @Test
    void testRectangleArea() {
        assertEquals(12.0, shapeCalculator.rectangleArea(3, 4));
        assertEquals(0.0, shapeCalculator.rectangleArea(0, 10));
        assertEquals(7.5, shapeCalculator.rectangleArea(2.5, 3));
    }

    @Test
    void testRectanglePerimeter() {
        assertEquals(14.0, shapeCalculator.rectanglePerimeter(3, 4));
        assertEquals(20.0, shapeCalculator.rectanglePerimeter(0, 10));
        assertEquals(11.0, shapeCalculator.rectanglePerimeter(2.5, 3));
    }

    @Test
    void testNegativeSideThrows() {
        assertThrows(IllegalArgumentException.class, () -> shapeCalculator.squareArea(-1));
        assertThrows(IllegalArgumentException.class, () -> shapeCalculator.squarePerimeter(-1));
    }

    @Test
    void testNegativeDimensionThrows() {
        assertThrows(IllegalArgumentException.class, () -> shapeCalculator.rectangleArea(-1, 4));
        assertThrows(IllegalArgumentException.class, () -> shapeCalculator.rectanglePerimeter(3, -2));
        assertThrows(IllegalArgumentException.class, () -> shapeCalculator.rectangleArea(-1, -2));
        assertThrows(IllegalArgumentException.class, () -> shapeCalculator.rectanglePerimeter(-3, -4));
    }
}
