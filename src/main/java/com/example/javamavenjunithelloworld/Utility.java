package com.example.javamavenjunithelloworld;
import java.util.*;
public class Utility {

    public static void nasimoddin() {
        System.out.println("I am Nasimoddin");
    }
    //Finding the area of the circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String s[]){
        nasimoddin();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        double area=areaOfCircle(radius);
        System.out.println("The area of the circle is: "+area);
    }
}
