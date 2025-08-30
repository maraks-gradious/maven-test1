package com.example.javamavenjunithelloworld;
import java.util.*;
public class Utility {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number to add: ");
    int a=sc.nextInt();
    System.out.println("Enter second number to add: ");
    int b=sc.nextInt();
    AddTwoNumbers(a,b);
    divya();
    sc.close();
  }
  public static void AddTwoNumbers(int a,int b){
    System.out.println("The result after adding two numbers is: "+(a+b));
  }
  public static void divya(){
    System.out.println("I am Divya");
  }
}
