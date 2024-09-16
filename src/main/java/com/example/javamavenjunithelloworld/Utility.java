public class CompareNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int maxi = largenum(x,y);
        System.out.println("The larger number is: " + maxi);
    }
    public static int largenum(int a, int b) {
        if(a>b) {
            return a;
        }else{
            return b;
        }
    }
}
