package com.example.calculator;

/**
 * A calculator for computing area and perimeter of squares and rectangles.
 */
public class ShapeCalculator {

    public double squareArea(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        return side * side;
    }

    public double squarePerimeter(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        return 4 * side;
    }

    public double rectangleArea(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative");
        }
        return length * width;
    }

    public double rectanglePerimeter(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative");
        }
        return 2 * (length + width);
    }
}
