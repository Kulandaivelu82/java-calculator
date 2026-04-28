package com.example.calculator;

/**
 * Calculates areas of various geometric shapes.
 */
public class AreaCalculator {

    /**
     * Calculates the area of a rectangle given its width and height.
     * Formula: A = width * height
     *
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @return the area of the rectangle
     * @throws IllegalArgumentException if width or height is negative
     */
    public double areaOfRectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height cannot be negative");
        }
        return width * height;
    }

    /**
     * Calculates the area of a triangle given its base and height.
     * Formula: A = (base * height) / 2
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     * @return the area of the triangle
     * @throws IllegalArgumentException if base or height is negative
     */
    public double areaOfTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("Base and height cannot be negative");
        }
        return (base * height) / 2.0;
    }
}
