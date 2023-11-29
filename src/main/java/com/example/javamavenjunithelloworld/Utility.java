public class Utility {
    public static double calculateSquareArea(double sideLength) {
        double area = sideLength * sideLength;
        return area;
    }

    public static void main(String[] args) {
        double sideLength = 5.0;
        double area = calculateSquareArea(sideLength);
        System.out.println("Area of the square with side length " + sideLength + " is: " + area);
    }
}
