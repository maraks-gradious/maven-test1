package com.example.javamavenjunithelloworld;

public class Utility {

    // Function with your name
    public static void dharuneswar() {
        System.out.println("I am Dharuneswar");
    }

    // Function for area of a circle
    public static double areaOfCircle(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // Small test
    public static void main(String[] args) {
        dharuneswar();
        double r = 5.0;
        System.out.println("Area of circle with radius " + r + " = " + areaOfCircle(r));
    }
}
