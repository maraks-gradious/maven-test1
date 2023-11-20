public class FindLargest {

    public static int findLargest(int num1, int num2, int num3) {
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        return largest;
    }

    public static void sayHello() {
        System.out.println("Hello, I am Lalitha!");
    }

    public static void main(String[] args) {
        int a = 10, b = 25, c = 7;
        int largestNumber = findLargest(a, b, c);
        System.out.println("The largest number is: " + largestNumber);

        sayHello();
    }
}
