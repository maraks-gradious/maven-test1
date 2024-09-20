package com.example.javamavenjunithelloworld;

public class Utility {

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static void chandrashekar() {
        System.out.println("I am Chandrashekar");
    }

    public static void main(String[] args) {
        chandrashekar();
        System.out.println("Square root of 25: " + squareRoot(25));        
    }
}