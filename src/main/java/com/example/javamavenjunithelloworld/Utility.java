package com.example.javamavenjunithelloworld;

public class Utility {


    public static boolean Nikita(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 10; 
        if (Nikita(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
