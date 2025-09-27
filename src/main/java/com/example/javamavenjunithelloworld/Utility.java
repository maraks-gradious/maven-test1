package com.example.javamavenjunithelloworld;

public class Utility {

    public void steve() {
        System.out.println("I am Steve");
    }

    public String isOddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public boolean isDivisibleBy2(int x) {
        return x % 2 == 0;
    }

    public boolean isDivisibleBy3(int y) {
        return y % 3 == 0;
    }

    public boolean isDivisibleBy4(int z) {
        return z % 4 == 0;
    }
    
    public boolean isDivisibleBy5(int a) {
        return a % 5 == 0;
    }

    public boolean isDivisibleBy6(int b) {
        return b % 6 == 0;
    }

    public boolean isDivisibleBy7(int c) {
        return c % 7 == 0;
    }

    public boolean isDivisibleBy8(int d) {
        return d % 8 == 0;
    }

    public boolean isDivisibleBy9(int e) {
        return e % 9 == 0;
    }

    public int getBiggerNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public int getBiggestNumber(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    public double divideTwoNumbers(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public double powerOfSum(double a, double b) {
        return Math.pow(a + b, 2);
    }

    public double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double getSquareArea(double side) {
        return side * side;
    }

    public double getRectangleArea(double length, double width) {
        return length * width;
    }

    public double getTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public double getSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot find square root of a negative number.");
        }
        return Math.sqrt(number);
    }
}