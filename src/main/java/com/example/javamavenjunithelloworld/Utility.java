import java.util.Scanner;
public class Utility {
    public static void Chandra(){
        System.out.println("I'm Chandra");
    }
    public static void areaOfSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of Square is: "+area);
    }
    public static void main(String [] args){
        Utility obj = new Utility();
        obj.areaOfSquare();
    }
}