package com.example.javamavenjunithelloworld;
import java.util.Scanner;
public class Utility {
     public  static void main(String[] a){
          
          Scanner s=new Scanner(System.in);
          int A=s.nextInt();
          int b=s.nextInt();
          int sum=A+b;
          System.out.println("The sum of two numbers is"+ sum);
          s.close();
    }
}
