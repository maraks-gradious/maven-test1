package com.example.javamavenjunithelloworld;
import java.util.*;
public class Utility {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find even or odd");
        int a = sc.nextInt();
        if(a%2 ==0){
            System.out.println("It is even Number");
        }else{
            System.out.println("It is odd Number");
        }
    }
}
