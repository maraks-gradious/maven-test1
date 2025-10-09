package com.example.javamavenjunithelloworld;

public class Utility {
    public static void sathvik() {
        System.out.println("I am Sathvik");
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public void printMessage() {
        System.out.println("This is Utility class called from Sathvik.java");
    }

    // Step 8 utility function: check if a number is odd or even
    public static void checkOddEven(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
    }
}
