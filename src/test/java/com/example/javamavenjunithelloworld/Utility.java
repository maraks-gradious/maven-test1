package com.example.javamavenjunithelloworld;
import java.util.Scanner;

public class Utility {
    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble(); 


        // Call the function to calculate the square root
        double squareRoot = calculateSquareRoot(number);

        System.out.println("The square root of " + number + " is " + squareRoot);

        scanner.close();
    }
}
