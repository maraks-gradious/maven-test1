package com.example.javamavenjunithelloworld;
import java.util.*;
public class Utility {

    public static void raheem(int n) {
        System.out.println("I am Raheem Shaik");
        if(n % 2 == 0) {
            System.out.print(n + " is Even");
        }else {
            System.out.print(n + " is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        raheem(n);
    }
}
