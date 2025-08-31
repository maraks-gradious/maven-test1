public class SquareRoot {

    public static double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot find square root of a negative number");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        double num = 25;
        System.out.println("Square root of " + num + " is: " + findSquareRoot(num));
    }
}
