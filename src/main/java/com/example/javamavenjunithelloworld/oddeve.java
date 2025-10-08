package com.example.javamavenjunitthelloworld;
import java.util.Scanner; 

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Read the integer from the user

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close(); // Close the scanner
    }
}