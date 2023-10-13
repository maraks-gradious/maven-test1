public class Utility
{
	public static void main (String args[])
	{
		System.out.println(checkOddOrEven(43));	
	}

    public static String checkOddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}