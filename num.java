package Add ;
import java.util.* ;
class num {
    public static void main(String[] args) {
        int a, b, c;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter two  numebrs:");
        a = enter.nextInt();
        b = enter.nextInt();
        c = a + b;
        System.out.println("The sum of the two numbers is " + c);
    }
}