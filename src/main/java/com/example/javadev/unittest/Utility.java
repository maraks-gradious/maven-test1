package com.example.javadev.unittest;

public class Utility {

    // Even or Odd
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Divisible check
    public static boolean isDivisible(int n, int d) {
        return n % d == 0;
    }

    // Compare two numbers
    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    // Max of three
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Print 1–10
    public static void print1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Add
    public static int add(int a, int b) {
        return a + b;
    }

    // Multiply
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Divide
    public static double divide(int a, int b) {
        return (double) a / b;
    }

    // Circle area
    public static double areaCircle(double r) {
        return Math.PI * r * r;
    }

    // Square area
    public static int areaSquare(int a) {
        return a * a;
    }

    // Rectangle area
    public static int areaRectangle(int l, int b) {
        return l * b;
    }

    // Triangle area
    public static double areaTriangle(double b, double h) {
        return 0.5 * b * h;
    }

    // Square root
    public static double sqrt(int n) {
        return Math.sqrt(n);
    }
}