package com.example.javamavenjunithelloworld;

public class Utility {

    // a. Check if the given number is odd or even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // b. Check if the number given is divisible by 2
    public static boolean isDivisibleBy2(int number) {
        return number % 2 == 0;
    }

    // Check if the number given is divisible by 3
    public static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    // Check if the number given is divisible by 4
    public static boolean isDivisibleBy4(int number) {
        return number % 4 == 0;
    }

    // Check if the number given is divisible by 5
    public static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    // Check if the number given is divisible by 6
    public static boolean isDivisibleBy6(int number) {
        return number % 6 == 0;
    }

    // Check if the number given is divisible by 7
    public static boolean isDivisibleBy7(int number) {
        return number % 7 == 0;
    }

    // Check if the number given is divisible by 8
    public static boolean isDivisibleBy8(int number) {
        return number % 8 == 0;
    }

    // Check if the number given is divisible by 9
    public static boolean isDivisibleBy9(int number) {
        return number % 9 == 0;
    }

    // c. Compare the given 2 numbers and return the bigger number
    public static int maxOfTwo(int a, int b) {
        return a > b ? a : b;
    }

    // d. Find the biggest number among 3 given numbers
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // e. Write the function to print the numbers from 1 to 10
    public static void printNumbersOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // f. Check if the given year is a leap year or not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // g. Add 2 numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // h. Multiply 2 numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // i. Divide 2 numbers
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
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
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // n. Find the area of a triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // o. Find the square root of the given number
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        return Math.sqrt(number);
    }


    // j.New function: Perform (a + b) * (a + b)
    public static int squareOfSum(int a, int b) {
        int sum = a + b;
        return sum * sum;
    }
}
