import java.util.*;
 class Utility {
    public int muskan(int a) {
        if(a%2==0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check if the number is even or odd");
        System.out.println("Enter numeber");
        int a=sc.nextInt();
        Utility obj = new Utility(); 
        if(obj.muskan(a)==1){
            System.out.println("Even");
        } 
        else{
            System.out.println("Odd");
        }
    }
}
