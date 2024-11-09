class Utility{

    public static void oddOrEven(int n){
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args){
        int n=5;
        oddOrEven(n);
    }
}