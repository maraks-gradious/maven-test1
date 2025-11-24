// SYED_ARIF - Utility Functions for GIT Assignment
import java.util.Scanner;

public class SYED_ARIF {
    public static void main(String[] args) {
        System.out.println("Hello World by SYED_ARIF");
        Scanner sc = new Scanner(System.in);
        
        // Test all functions
        System.out.println("Divisible by 2: " + isDivisible(10, 2)); // true
        System.out.println(compareNumbers(5, 3)); // x > y
        System.out.println("Biggest of 3: " + biggestOfThree(1, 5, 3)); // 5
        sc.close();
    }
    
    // a. Divisible by 2,3,5,9 (call 4x)
    public static boolean isDivisible(int num, int div) { return num % div == 0; }
    
    // b. Compare x,y
    public static String compareNumbers(int x, int y) {
        if (x > y) return "x > y";
        if (x < y) return "x < y";
        return "x = y";
    }
    
    // c. Biggest of 3
    public static int biggestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    // d. Biggest of 3-10 (array)
    public static int biggestOfN(int[] nums) {
        int max = nums[0]; for(int n : nums) if(n > max) max = n;
        return max;
    }
    
    // e. Leap year
    public static boolean isLeapYear(int year) { return year % 4 == 0; }
    
    // f. (a+b)^2 or a^2+b^2
    public static boolean checkSquare(int a, int b, int n) {
        return n == (a+b)*(a+b) || n == a*a + b*b;
    }
    
    // g. Square area
    public static double squareArea(double side) { return side * side; }
    
    // h. Rectangle area
    public static double rectangleArea(double l, double b) { return l * b; }
    
    // i. Square root
    public static double squareRoot(double num) { return Math.sqrt(num); }
}
