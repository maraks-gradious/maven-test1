package com.example.javamavenjunithelloworld;

public class Utility {

    // Name function
    public static void kaviya() {
        System.out.println("I am Kaviya");
    }

    // a. Check if the given number is odd or even
    public static String isOddOrEven(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    // b. Check divisibility by 2 to 9
    public static boolean isDivisibleBy2(int x) { return x % 2 == 0; }
    public static boolean isDivisibleBy3(int x) { return x % 3 == 0; }
    public static boolean isDivisibleBy4(int x) { return x % 4 == 0; }
    public static boolean isDivisibleBy5(int x) { return x % 5 == 0; }
    public static boolean isDivisibleBy6(int x) { return x % 6 == 0; }
    public static boolean isDivisibleBy7(int x) { return x % 7 == 0; }
    public static boolean isDivisibleBy8(int x) { return x % 8 == 0; }
    public static boolean isDivisibleBy9(int x) { return x % 9 == 0; }

    // c. Compare 2 numbers and return the bigger one
    public static int biggerNumber(int a, int b) {
        return (a > b) ? a : b;
    }

    // d. Find the biggest number among 3 given numbers
    public static int biggestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // e. Print the numbers from 1 to 10
    public static void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // f. Check if the given year is a leap year or not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // g. Add 2 numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // h. Multiply 2 numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // i. Divide 2 numbers
    public static double divide(double a, double b) {
        return a / b;
    }

    // j. (a + b)^2
    public static double squareOfSum(double a, double b) {
        return Math.pow(a + b, 2);
    }

    // k. Find the area of the circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // l. Find the area of the square
    public static double areaOfSquare(double side) {
        return side * side;
    }

    // m. Find the area of the rectangle
    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    // n. Find the area of a triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // o. Find the square root of the given number
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Simple main to test everything
    public static void main(String[] args) {
        kaviya();
        System.out.println("10 is: " + isOddOrEven(10));
        System.out.println("Divisible by 3? " + isDivisibleBy3(9));
        System.out.println("Bigger of 5, 8: " + biggerNumber(5, 8));
        System.out.println("Biggest of 3, 7, 2: " + biggestOfThree(3, 7, 2));
        printOneToTen();
        System.out.println("2024 leap year? " + isLeapYear(2024));
        System.out.println("Add 4+5: " + add(4, 5));
        System.out.println("Multiply 4*5: " + multiply(4, 5));
        System.out.println("Divide 10/2: " + divide(10, 2));
        System.out.println("(2+3)^2: " + squareOfSum(2, 3));
        System.out.println("Area of circle (r=5): " + areaOfCircle(5));
        System.out.println("Area of square (s=4): " + areaOfSquare(4));
        System.out.println("Area of rectangle (4x6): " + areaOfRectangle(4, 6));
        System.out.println("Area of triangle (b=6,h=3): " + areaOfTriangle(6, 3));
        System.out.println("Square root of 16: " + squareRoot(16));
    }
}