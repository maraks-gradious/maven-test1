import java.util.*;
class Utility{
    public static void main(String[] args){
        Sravani();
        float side;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side value of the square :  ");
        side=sc.nextFloat();
        System.out.println("\nArea of the square is :  "+SquareArea(side));

    }
    public static void Sravani(){
        System.out.println("I'm Sravani");
    } 
    public static float SquareArea(float side){
        return side*side;
    }
}
