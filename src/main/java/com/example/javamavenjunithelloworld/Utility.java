package com.example.javamaven.junithelloworld;

import java.util.ArrayList;
import java.util.List;

public class Utility {
    public static boolean isOdd(int n){ return (n & 1) != 0; }
    public static boolean isEven(int n){ return (n & 1) == 0; }

    public static boolean isDivisibleBy(int n, int d){
        if (d == 0) throw new IllegalArgumentException("divisor must be non-zero");
        return n % d == 0;
    }
    public static boolean isDivisibleBy2(int n){ return isDivisibleBy(n,2); }
    public static boolean isDivisibleBy3(int n){ return isDivisibleBy(n,3); }
    public static boolean isDivisibleBy4(int n){ return isDivisibleBy(n,4); }
    public static boolean isDivisibleBy5(int n){ return isDivisibleBy(n,5); }
    public static boolean isDivisibleBy6(int n){ return isDivisibleBy(n,6); }
    public static boolean isDivisibleBy7(int n){ return isDivisibleBy(n,7); }
    public static boolean isDivisibleBy8(int n){ return isDivisibleBy(n,8); }
    public static boolean isDivisibleBy9(int n){ return isDivisibleBy(n,9); }

    public static int bigger(int a, int b){ return (a > b) ? a : b; }
    public static int biggestOfThree(int a, int b, int c){ return Math.max(a, Math.max(b, c)); }

    // If you must "print 1..10", you can print here. Returning a list is often nicer for tests.
    public static List<Integer> oneToTen(){
        List<Integer> list = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) list.add(i);
        return list;
    }

    public static boolean isLeapYear(int y){
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    public static int add(int a, int b){ return a + b; }
    public static int multiply(int a, int b){ return a * b; }
    public static int divide(int a, int b){
        if (b == 0) throw new ArithmeticException("divide by zero");
        return a / b;
    }
    public static int squareOfSum(int a, int b){ int s = a + b; return s * s; }

    public static double areaOfCircle(double r){
        if (r < 0) throw new IllegalArgumentException("radius must be non-negative");
        return Math.PI * r * r;
    }
    public static double areaOfSquare(double s){
        if (s < 0) throw new IllegalArgumentException("side must be non-negative");
        return s * s;
    }
    public static double areaOfRectangle(double w, double h){
        if (w < 0 || h < 0) throw new IllegalArgumentException("dimensions must be non-negative");
        return w * h;
    }
    public static double areaOfTriangle(double base, double height){
        if (base < 0 || height < 0) throw new IllegalArgumentException("dimensions must be non-negative");
        return 0.5 * base * height;
    }
    public static double squareRoot(double x){
        if (x < 0) throw new IllegalArgumentException("x must be non-negative");
        return Math.sqrt(x);
    }
}
