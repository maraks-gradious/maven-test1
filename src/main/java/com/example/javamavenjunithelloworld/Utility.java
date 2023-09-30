package com.example.javamavenjunithelloworld;

public class Utility {
    public static void suryanshi() {
        System.out.println("I am Suryanshi Jain");
    }

    public static boolean evenorodd(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        suryanshi();
        System.out.println(evenorodd(3));

    }
}
