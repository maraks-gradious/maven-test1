    class MathProblems {

    // Check if odd or even
    public static void checkOddEven(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    //Check divisibility
    public static boolean isDivisibleBy2(int x) { return x % 2 == 0; }
    public static boolean isDivisibleBy3(int x) { return x % 3 == 0; }
    public static boolean isDivisibleBy4(int x) { return x % 4 == 0; }
    public static boolean isDivisibleBy5(int x) { return x % 5 == 0; }
    public static boolean isDivisibleBy6(int x) { return x % 6 == 0; }
    public static boolean isDivisibleBy7(int x) { return x % 7 == 0; }
    public static boolean isDivisibleBy8(int x) { return x % 8 == 0; }
    public static boolean isDivisibleBy9(int x) { return x % 9 == 0; }

    // Compare 2 numbers
    public static int biggerNumber(int a, int b) {
        return (a > b) ? a : b;
    }

    // Biggest among 3 numbers
    public static int biggestOfThree(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    // Print 1 to 10
    public static void print1to10() {
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");
        System.out.println();
    }

    //Check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    //Add 2 numbers
    public static int add(int a, int b) {
        return a + b;
    }

    //Multiply 2 numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    //Divide 2 numbers
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed");
            return -1;
        }
        return (double) a / b;
    }

    //(a + b)^2
    public static int squareOfSum(int a, int b) {
        return (a + b) * (a + b);
    }

    // Area of circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of square
    public static double areaOfSquare(double side) {
        return side * side;
    }

    //Area of rectangle
    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    //Area of triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    //Square root of number
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    // Main method to test all
    public static void main(String[] args) {
        checkOddEven(7);
        System.out.println("Divisible by 3? " + isDivisibleBy3(9));
        System.out.println("Bigger Number: " + biggerNumber(10, 20));
        System.out.println("Biggest of Three: " + biggestOfThree(10, 30, 20));
        print1to10();
        System.out.println("Leap Year? " + isLeapYear(2024));
        System.out.println("Addition: " + add(5, 7));
        System.out.println("Multiplication: " + multiply(4, 6));
        System.out.println("Division: " + divide(10, 2));
        System.out.println("(a+b)^2: " + squareOfSum(2, 3));
        System.out.println("Area of Circle: " + areaOfCircle(5));
        System.out.println("Area of Square: " + areaOfSquare(4));
        System.out.println("Area of Rectangle: " + areaOfRectangle(5, 10));
        System.out.println("Area of Triangle: " + areaOfTriangle(6, 8));
        System.out.println("Square Root: " + squareRoot(25));
    }
}
