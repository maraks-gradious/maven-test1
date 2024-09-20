package com.example.javamavenjunithelloworld;

public class Utility {

    public static void isOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void tharun() {
        System.out.println("I am Tharun");
    }

    public static void main(String[] args) {
        tharun();
        isOddOrEven(5);
    }
}
