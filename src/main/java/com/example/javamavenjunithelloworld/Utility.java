package com.example.javamavenjunithelloworld;

public class Utility {
    public static void intro() {
        System.out.println("I am Sai Vishwak");;
    }
    public static int area_of_rectangle(int l, int b) {
        if (l<0 || b<0) {
            return -1;
        }
        return l * b;
    }
}
