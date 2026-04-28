package com.example.calculator;

import java.util.Scanner;

/**
 * Entry point - runs an interactive calculator from the command line.
 */
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        AreaCalculator areaCalculator = new AreaCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Java Calculator ===");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println();
        System.out.println(a + " + " + b + " = " + calc.add(a, b));
        System.out.println(a + " - " + b + " = " + calc.subtract(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiply(a, b));

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + calc.divide(a, b));
        } else {
            System.out.println("Skipping division (cannot divide by zero).");
        }

        System.out.println();
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();

        try {
            System.out.println("Area of circle with radius " + radius + " = "
                    + areaCalculator.areaOfCircle(radius));
        } catch (IllegalArgumentException ex) {
            System.out.println("Skipping circle area calculation (" + ex.getMessage() + ").");
        }

        scanner.close();
    }
}
