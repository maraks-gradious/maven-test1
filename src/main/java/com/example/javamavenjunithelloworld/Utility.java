package com.example.javamavenjunithelloworld;

class Utility{
    public static void main(String[] args){
        printNumbers(10);
    }

    public void printNumbers(int n){
        for(int i=1;i<n;i++){
            System.out.println(i);
        }
    }
}