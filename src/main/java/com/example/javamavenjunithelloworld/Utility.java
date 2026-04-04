package com.example.javamavenjunithelloworld;

public class Utility {

    // Function to find the biggest of 3 numbers
    public static int findBiggest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void sai() {
        System.out.println("I am Sai Tharun");
    }
}