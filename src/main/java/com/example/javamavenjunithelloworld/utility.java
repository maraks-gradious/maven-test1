import java.util.Scanner;

class utility{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();
		if (gayatri(num)) System.out.println("Even!");
		else System.out.println("Odd!");
	}
	public static boolean gayatri(int num){
		return num%2==0;

	}


}