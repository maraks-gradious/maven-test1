package com.example.javamavenjunithelloworld;

public class Utility {
    public static void sreeram(){
        System.out.println("I am Sreeram");
    }

    public static void checkOddEven(int number){
        if (number % 2 == 0){
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        sreeram();
        checkOddEven(10);
        checkOddEven(7);
        checkOddEven(15);
    }
}
