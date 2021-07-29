import java.util.* ;
class T {
    public static void main(String []args){
        float x,y,z,product;
        Scanner enter= new Scanner(System.in);
        System.out.println("enter first number:");
        x=enter.nextFloat();
        System.out.println("Enter the second number :");
        y=enter.nextFloat();
        System.out.println("Enter the third :");
        z=enter.nextFloat();
        product=x*y*z;
        System.out.println("The Product of the three numbers is : "+product);


    }
}