import java.util.*;

class Utility{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The Greater Number is: "+ greaterNumber(a, b));
    }
    public static int greaterNumber(int a, int b) {
        if(a>b){
            return a;
        }
        else return b;
    }
}