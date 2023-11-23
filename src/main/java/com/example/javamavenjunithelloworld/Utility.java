package com.example.javamavenjunithelloworld;
public class Utility{
    public static int funn(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        int a=10;
        int b=20;
        int ans=funn(a,b);
        System.out.println("The sum of two numbers is "+ans);
    }

}