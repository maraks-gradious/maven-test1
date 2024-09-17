// package com.example.javamavenjunithelloworld;

import java.util.*;
public class Utility {
    private static String evenOrOdd(int num) {
        if(num%2==0) {
            return num+" is even";
        }
        else {
            return num+" is odd";
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        System.out.println(evenOrOdd(num));
    }
}
