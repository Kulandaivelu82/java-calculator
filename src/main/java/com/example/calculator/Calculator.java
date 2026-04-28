package com.example.calculator;

/**
 * A simple calculator that delegates arithmetic and area calculations
 * to specialized calculator classes.
 */
public class Calculator {

    private final ArithmeticCalculator arithmeticCalculator;
    private final AreaCalculator areaCalculator;

    /**
     * Constructs a Calculator with default arithmetic and area calculators.
     */
    public Calculator() {
        this.arithmeticCalculator = new ArithmeticCalculator();
        this.areaCalculator = new AreaCalculator();
    }

    /**
     * Adds two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return arithmeticCalculator.add(a, b);
    }

    /**
     * Subtracts two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the difference of a and b
     */
    public int subtract(int a, int b) {
        return arithmeticCalculator.subtract(a, b);
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return arithmeticCalculator.multiply(a, b);
    }

    /**
     * Divides two integers.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(int a, int b) {
        return arithmeticCalculator.divide(a, b);
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
        return areaCalculator.areaOfRectangle(width, height);
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
        return areaCalculator.areaOfTriangle(base, height);
    }
}