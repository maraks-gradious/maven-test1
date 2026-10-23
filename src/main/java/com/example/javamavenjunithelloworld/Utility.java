
package com.example.javamavenjunithelloworld;

public class Utility {

    public static void himaja() {
        System.out.println("I am Himaja");
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        himaja();

        double radius = 5;
        System.out.println("Area of circle: " + areaOfCircle(radius));
    }
}
