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
     * Calculates the area of a circle given its radius.
     * Formula: A = π * r²
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     * @throws IllegalArgumentException if radius is negative
     */
    public double areaOfCircle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }
}
