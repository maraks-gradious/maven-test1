
public class Utility {

    public void harshitha() {
        System.out.println("I am harshitha");
    }

    public void isOddOrEven(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result);
    }

    public void isDivisibleBy2(int x) {
        System.out.println(x + (x % 2 == 0 ? " is divisible by 2." : " is not divisible by 2."));
    }

    public void isDivisibleBy3(int y) {
        System.out.println(y + (y % 3 == 0 ? " is divisible by 3." : " is not divisible by 3."));
    }

    public void isDivisibleBy4(int z) {
        System.out.println(z + (z % 4 == 0 ? " is divisible by 4." : " is not divisible by 4."));
    }

    public void compareTwoNumbers(int a, int b) {
        int bigger = (a > b) ? a : b;
        System.out.println("The bigger number between " + a + " and " + b + " is " + bigger);
    }

    public void findBiggestAmongThree(int a, int b, int c) {
        int biggest = Math.max(a, Math.max(b, c));
        System.out.println("The biggest number among " + a + ", " + b + ", and " + c + " is " + biggest);
    }

    public void printNumbers1To10() {
        System.out.print("Numbers from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void isLeapYear(int year) {
        boolean leap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        System.out.println(year + (leap ? " is a leap year." : " is not a leap year."));
    }

    public void addTwoNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public void multiplyTwoNumbers(int a, int b) {
        int product = a * b;
        System.out.println("The product of " + a + " and " + b + " is " + product);
    }

    public void divideTwoNumbers(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double result = a / b;
            System.out.println("The result of dividing " + a + " by " + b + " is " + result);
        }
    }

    public void squareOfSum(int a, int b) {
        int square = (a + b) * (a + b);
        System.out.println("The square of the sum of " + a + " and " + b + " is " + square);
    }

    public void areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }

    public void areaOfSquare(double side) {
        double area = side * side;
        System.out.println("The area of a square with side " + side + " is " + area);
    }

    public void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is " + area);
    }

    public void areaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("The area of a triangle with base " + base + " and height " + height + " is " + area);
    }

    public void squareRoot(double number) {
        double result = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + result);
    }
}
