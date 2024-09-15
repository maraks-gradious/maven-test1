
package com.example.javamavenjunithelloworld;

public class Utility {
    // Example utility function that adds two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Your custom function
    public static void sumit() {
        System.out.println("I am Sumit");
    }
    
    public static boolean isOdd(int number) {
    return number % 2 != 0;
     }

    public static boolean isEven(int number) {
    return number % 2 == 0;
    }
 
    public static boolean isDivisibleBy2(int number) {
    return number % 2 == 0;
}

public static boolean isDivisibleBy3(int number) {
    return number % 3 == 0;
}

public static boolean isDivisibleBy4(int number) {
    return number % 4 == 0;
}

public static boolean isDivisibleBy5(int number) {
    return number % 5 == 0;
}

public static boolean isDivisibleBy6(int number) {
    return number % 6 == 0;
}

public static boolean isDivisibleBy7(int number) {
    return number % 7 == 0;
}

public static boolean isDivisibleBy8(int number) {
    return number % 8 == 0;
}

public static boolean isDivisibleBy9(int number) {
    return number % 9 == 0;
}

public static int findBiggerNumber(int a, int b) {
    return Math.max(a, b);
}

public static int findBiggestNumber(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
}
  public static void printNumbers1To10() {
    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
    }
   public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

}
  public static int addNumbers(int a, int b) {
    return a + b;
}
    public static int multiplyNumbers(int a, int b) {
    return a * b;
}
   public static double divideNumbers(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
    return (double) a / b;
}
    public static int squareOfSum(int a, int b) {
    return (a + b) * (a + b);
}
     public static double areaOfCircle(double radius) {
    return Math.PI * radius * radius;
}
   public static double areaOfSquare(double side) {
    return side * side;
}
   public static double areaOfRectangle(double length, double width) {
    return length * width;
}
   public static double areaOfTriangle(double base, double height) {
    return 0.5 * base * height;
}
    public static double findSquareRoot(double number) {
    return Math.sqrt(number);
}

}
