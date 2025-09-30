package com.example.javamavenjunithelloworld;

public class Utility {

    // 1. Function with your name (Task 8 - Note)
    public static void nagiri(String fave) {
        System.out.println("I am Akshaya Nagiri (" + fave + ")");
    }

    // 2. Example Utility: Check if the given number is Odd or Even (Task 8a)
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}