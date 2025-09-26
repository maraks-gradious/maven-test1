package com.example.javamavenjunithelloworld;
import java.util.Scanner;

public class Utility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check odd or even: ");
        int  x = sc.nextInt();
        if(x%2==0){
            System.out.println("The number "+x+" is a even number.");
        }
        else{
            System.out.println("The number "+x+" is a even number.");
        }
        sc.close();
    }
    public static void chandan(){
        System.out.println("Hello I am Chandan");
    }
}
