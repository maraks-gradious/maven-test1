package com.example.javamavenjunitthelloworld;
import java.util.Scanner;
public class Utility {
  
    public static void vignesh() {
        System.out.println("I am vignesh");
    }
    // Function to find the maximum of three numbers
    public int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        Utility utility = new Utility();  

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        int result = utility.maxOfThree(num1, num2, num3);

        System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
        scanner.close();  
        vignesh();
      
    }
}
