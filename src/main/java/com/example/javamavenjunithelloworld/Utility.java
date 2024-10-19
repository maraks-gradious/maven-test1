
public class Utility{

    public static void Manish(){
        System.out.println("Sai Manish Soma");
    }
    public static int add(int a,int b){
        return a+b;
    }

    public static void main (String[] args)
	{
        Utility u = new Utility()
        u.Manish();
		System.out.println(u.add( 5,6 ));
	}
}