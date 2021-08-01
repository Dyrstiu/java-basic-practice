import java.util.*;
class Circle{
    final static double PI=3.142;// sysmbolic constants delared in class
    public static void main(String []args){
        double radius,area ,circumfrence ;//local variables
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius=enter.nextDouble();
        area=PI*radius*radius;
        circumfrence=2*PI*radius;
        System.out.println("Area"+area+"\t"+"Circumference="+circumfrence);
    }
}