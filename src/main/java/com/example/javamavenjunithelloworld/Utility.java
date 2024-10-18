package com.example.javamavenjunithelloworld;
import java.util.*;
public class Utility {

    public static void aarthi() {
        System.out.println("I am Aarthi");
    }
    //Find square root of a given number
    public static int squareRoot(int num) {
        return (int)Math.sqrt(num);
    }
    public static void main(String s[]){
        aarthi();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sqRt=squareRoot(num);
        System.out.println("Square root of the number is: "+sqRt);
        sc.close();
    }
}
