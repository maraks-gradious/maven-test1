package com.example.javamavenjunithelloworld;

public class Utility {
    // Function to check if a number is odd or even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Function to check if a number is divisible by 2
    public static boolean isDivisibleBy2(int number) {
        return number % 2 == 0;
    }

    // Function to compare two numbers and return the bigger number
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    // Function to find the biggest number among three given numbers
    public static int getMaxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Function to print numbers from 1 to 10
    public static void printNumbersFrom1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Function to divide two numbers
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Function to calculate (a + b)²
    public static int squareOfSum(int a, int b) {
        int sum = a + b;
        return sum * sum;
    }

    // Add more functions for other tasks as needed

    // Function to find the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Function to find the area of a square
    public static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }

    // Function to find the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Function to find the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Function to find the square root of a number
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(number);
    }    
}