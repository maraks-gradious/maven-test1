package main.java.com.example.javamavenjunithelloworld;

public class Utility {
    public static void main(String[] args) {
        System.out.println("I am Ram");

        Utility utility = new Utility(); 
        double radius = 5.0; 
        double area = utility.calculateCircleArea(radius);
        System.out.println("Area of the circle: " + area);
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
