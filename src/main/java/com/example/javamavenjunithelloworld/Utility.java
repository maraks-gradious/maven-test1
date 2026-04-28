package com.example.javamavenjunithelloworld;

public class Utility {

    // Personal intro function
    public void steve() {
        System.out.println("I am Steve");
    }

    // a. Check if the given number is odd or even
    public String isOddOrEven(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    // b. Check if the number is divisible by 2, 3, 4, 5, 6, 7, 8, 9
    public boolean isDivisibleBy2(int x) { return x % 2 == 0; }
    public boolean isDivisibleBy3(int x) { return x % 3 == 0; }
    public boolean isDivisibleBy4(int x) { return x % 4 == 0; }
    public boolean isDivisibleBy5(int x) { return x % 5 == 0; }
    public boolean isDivisibleBy6(int x) { return x % 6 == 0; }
    public boolean isDivisibleBy7(int x) { return x % 7 == 0; }
    public boolean isDivisibleBy8(int x) { return x % 8 == 0; }
    public boolean isDivisibleBy9(int x) { return x % 9 == 0; }

    // c. Compare 2 numbers and return the bigger number
    public int getBigger(int x, int y) {
        return (x >= y) ? x : y;
    }

    // d. Find the biggest number among 3 given numbers
    public int getBiggest(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    // e. Print the numbers from 1 to 10
    public void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // f. Check if the given year is a leap year or not
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // g. Add 2 numbers
    public double add(double a, double b) {
        return a + b;
    }

    // h. Multiply 2 numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // i. Divide 2 numbers
    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    // j. (a + b)^2
    public double squareOfSum(double a, double b) {
        return (a + b) * (a + b);
    }

    // k. Find the area of the circle
    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // l. Find the area of the square
    public double areaOfSquare(double side) {
        return side * side;
    }

    // m. Find the area of the rectangle
    public double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // n. Find the area of a triangle
    public double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // o. Find the square root of the given number
    public double squareRoot(double n) {
        return Math.sqrt(n);
    }
}
