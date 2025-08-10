package com.example.javamavenjunithelloworld;

public class Utility {
    public static void main(String[] args) {
        int a = 23;
        System.out.println(isEvenOrOdd(a));
        Bhuvan();
    }
    public static void Bhuvan(){
        System.out.println("I am Bhuvan");
    }
    public static String isEvenOrOdd(int n){
        if(n%2 ==0){
            return "Even number";
        }
        else{
            return "Odd number";
        }
    }
}
