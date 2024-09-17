public class Utility{
    public static void gnanasree(int number){
        if(number%2 == 0){
            System.out.println(number+" is even");
        }
        else{
            System.out.println(number+" is odd");
        }
    }
    public static void main(String[] args){
        int number=7;
        gnanasree(number);
    }
}