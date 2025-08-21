
public class Utility {


    public static String medhaOddEven(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    // b. Check divisibility by 2,3,4,5,6,8,9,10
    public static String medhaDivisible(int n) {
        StringBuilder result = new StringBuilder("Divisible by: ");
        int[] divisors = {2, 3, 4, 5, 6, 8, 9, 10};
        for (int d : divisors) {
            if (n % d == 0) result.append(d).append(" ");
        }
        return result.toString();
    }

    // c. Compare 2 numbers
    public static int medhaCompare(int a, int b) {
        return (a > b) ? a : b;
    }

    // d. Biggest among 3 numbers
    public static int medhaBiggest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // e. Print numbers 1 to 10
    public static void medhaPrint1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // f. Check leap year
    public static boolean medhaLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // g. Add 2 numbers
    public static int medhaAdd(int a, int b) {
        return a + b;
    }

    // h. Multiply 2 numbers
    public static int medhaMultiply(int a, int b) {
        return a * b;
    }

    // i. Divide 2 numbers
    public static double medhaDivide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return (double) a / b;
    }

    // j. (a + b)^2
    public static int medhaSquareOfSum(int a, int b) {
        return (a + b) * (a + b);
    }

    // k. Area of circle
    public static double medhaAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // l. Area of square
    public static double medhaAreaSquare(double side) {
        return side * side;
    }

    // m. Area of rectangle
    public static double medhaAreaRectangle(double length, double width) {
        return length * width;
    }

    // n. Area of triangle
    public static double medhaAreaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // o. Square root
    public static double medhaSqrt(double n) {
        return Math.sqrt(n);
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("Odd/Even (5): " + medhaOddEven(5));
        System.out.println("Divisible (60): " + medhaDivisible(60));
        System.out.println("Compare (10, 20): " + medhaCompare(10, 20));
        System.out.println("Biggest (5, 9, 2): " + medhaBiggest(5, 9, 2));
        medhaPrint1to10();
        System.out.println("Leap Year (2024): " + medhaLeapYear(2024));
        System.out.println("Add (5+3): " + medhaAdd(5, 3));
        System.out.println("Multiply (4*6): " + medhaMultiply(4, 6));
        System.out.println("Divide (10/2): " + medhaDivide(10, 2));
        System.out.println("(a+b)^2 (3,4): " + medhaSquareOfSum(3, 4));
        System.out.println("Area Circle (r=5): " + medhaAreaCircle(5));
        System.out.println("Area Square (s=4): " + medhaAreaSquare(4));
        System.out.println("Area Rectangle (5,7): " + medhaAreaRectangle(5, 7));
        System.out.println("Area Triangle (10,8): " + medhaAreaTriangle(10, 8));
        System.out.println("Square Root (49): " + medhaSqrt(49));
    }
}