package com.example.calculator;

/**
 * A simple calculator that performs basic arithmetic operations.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

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
}