package com.example.javamavenjunithelloworld;

public class Utility {
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return number + " is Even";
        } else {
            return number + " is Odd";
        }
    }

    public static void aMAR001() {
        System.out.println("I am AMAR001");
    }

    public static void main(String[] args) {
        Utility.aMAR001();
        System.out.println(Utility.checkOddEven(99));

        System.out.println(Utility.checkOddEven(50));
    }
}
