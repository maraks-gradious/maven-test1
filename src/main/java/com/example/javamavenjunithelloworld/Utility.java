import java.util.Scanner;

public class Utility {
    public static int findGreatest(int a, int b, int c) {
        int greatest = a;
        
        if (b > greatest) {
            greatest = b;
        }
        
        if (c > greatest) {
            greatest = c;
        }
        
        return greatest;
    }
	
    public static void sakshi()
	{
		System.out.println("I am Sakshi");
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int n3 = scanner.nextInt();
        
        int greatestNumber = findGreatest(n1, n2, n3);
        System.out.println("The greatest number is: " + greatestNumber);
		sakshi();
        
        scanner.close();
    }
}