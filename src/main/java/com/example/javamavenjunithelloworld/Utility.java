package com.example.javamavenjunithelloworld;

public class Utility {

    // e. Print numbers 1 to 10
    public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // f. Leap year check
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // g. Add 2 numbers
    public int add(int a, int b) {
        return a + b;
    }

    // h. Multiply 2 numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // i. Divide 2 numbers
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }

    // j. (a + b)
    public int sumAB(int a, int b) {
        return a + b;
    }

    // k. Area of circle
    public double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // l. Area of square
    public double areaSquare(double side) {
        return side * side;
    }

    // m. Area of rectangle
    public double areaRectangle(double length, double breadth) {
        return length * breadth;
    }

    // n. Area of triangle
    public double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // o. Square root of number
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}
