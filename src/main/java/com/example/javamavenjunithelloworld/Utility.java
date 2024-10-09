package main.java.com.example.javamavenjunithelloworld;

public class Utility {
    public static String isOddOrEven(int number) {
        if (number % 2 == 0) {
            return number + " is even";
        } else {
            return number + " is odd";
        }
    }

    public static void raunak() {
        System.out.println("I am Raunak");
    }

    public static void main(String[] args) {
        System.out.println(isOddOrEven(7));
        raunak();
    }
}