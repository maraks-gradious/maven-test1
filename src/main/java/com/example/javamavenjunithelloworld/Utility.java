
public class Utility {

    
    public static void Kanmani() {
        System.out.println("I am Kanmani");
    }

    // Function to calculate area of circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Main method
    public static void main(String[] args) {
        
        Kanmani();

      
        double radius = 5.0;

        
        double area = calculateArea(radius);

        
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}