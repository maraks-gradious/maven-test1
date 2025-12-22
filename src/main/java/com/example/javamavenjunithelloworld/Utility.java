package com.example.javamavenjunithelloworld;

public class Utility {
    public static void main(String[] args) {
        System.out.println(isLeap(2024));
        Kaushal();
    }

    private static void Kaushal() {
        System.out.println("I am Kaushal.");
    }

    private static boolean isLeap(int year) {
        if (year % 400 == 0) {
        return true;
    }
    if (year % 100 == 0) {
        return false;
    }
    return year % 4 == 0;
    }
}
