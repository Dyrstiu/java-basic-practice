/*import java.util.*;
public class Shape{
    float length,width;
    public void getDimension(){
        Scanner enter =new Scanner(System.in);
        System.out.println("Enter the length:");
        length=enter.nextFloat();
        System.out.println("Enter the width  :");
        width=enter.nextFloat();

    }
    public void calculateArea(){
        System.out.println("The area is "+(length*width));

    }
    class Trial{
        public void main(String[]args){
            Shape rectangle=new Shape();
            rectangle.getDimension();
            rectangle.calculateArea();


        }

}

}*/
import java.util.*;
public class Shape{
    float length,width;
    public static void main(String[]args){
    public void getDimensions(){
        Scanner enter=new Scanner(System.in);
        System.out.println("Enter the length");
        length=enter.nextFloat();
        System.out.println("Enter the width");
        width=enter.nextFloat();
    }
    public void calculateArea(){
        System.out.println("The area is "+(length*width));
    }
    }
}
/*class Trial{
           public static void main(String[]args){
           Shape rectangle=new Shape();
           rectangle.getDimensions();
           rectangle.calculateArea();
        }
        }*/