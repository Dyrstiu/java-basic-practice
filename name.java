import java.util.* ;
class myname{
    public static void main(String []args){
        char name1, name2,fullname;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter your first name :");
        name1 =enter.next().charAt(0,1,2,3,4);
        System.out.println("enter your second name: ");
        name2 =enter.next().charAt(0,1,2,3,4);
        System.out.println("Your full name is "+name1 +name2 );
    }
}