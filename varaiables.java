import java.util.*;
public class Y{
    public static double TAX ;//class varaible
    public double quantity,price;//instance variables
    protected void Pay (double q,double p){//q,p and total are local variables
        double total;
        price=p;
        quantity=q;
        total= quantity*price ;
        System.out.println("The price VAT inclusive is "+ ((1+TAX)*total));

    }
    public static void main(String []args){
        Y y=new Y();//object instatiated using keyword new
        Scanner enter =new Scanner(System.in);
        System.out.println("Enter quantity sold :");
        y.quantity=enter.nextDouble();//accessing instance variable using object y
        System.out.println("Enter unit price of quantity sold ");
        y.price= enter.nextDouble();// accessing instance variable using object name y
        System.out.println("Enter tax for goods sold");
        Y.TAX=enter.nextDouble();//accessing class variable using class name y
        y.Pay(y.quantity, y.price);//Message passing
    }

}