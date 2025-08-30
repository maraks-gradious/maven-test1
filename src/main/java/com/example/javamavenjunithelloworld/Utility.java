package com.example.javamavenjunithelloworld;
import java.util.*;
public class Utility {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number to add: ");
    int a=sc.nextInt();
    System.out.print("Enter second number to add: ");
    int b=sc.nextInt();
    AddTwoNumbers(a,b);
    Divya();
    sc.close();
  }
  public static void AddTwoNumbers(int a,int b){
    System.out.println("The result by adding two numbers is: "+(a+b));
  }

  public static void Divya(){
    System.out.println("I am Divya Sri Lakshmi");
  }
}
