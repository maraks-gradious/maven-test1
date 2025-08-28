public class Utility {

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    static void praveen(){
        System.out.println("I am Praveen");
    }

    public static void main(String[] args) {
        double area = areaOfCircle(543.43);
        System.out.println("Area of the circle: " + area);
        Utility.praveen();
    }
}
