import java.util.Scanner;

public class utils {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of one side of the square: ");

        double sideLength = scanner.nextDouble();
        scanner.close();
        double area = sideLength * sideLength;
        System.out.println("The area of the square is: " + area);
    }
}
