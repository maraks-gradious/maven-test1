package com.example.javamavenjunithelloworld;

public class Utility {

    public static void main(String[] args) {
        int a = 25;
        int b = 60;
        int c = 45;

        int biggest = findBiggest(a, b, c);
        System.out.println("The biggest number among " + a + ", " + b + ", and " + c + " is: " + biggest);

        Niranjan();
    }

    public static int findBiggest(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static void Niranjan() {
        System.out.println("I am Niranjan Reddy Kandula");
    }
}
