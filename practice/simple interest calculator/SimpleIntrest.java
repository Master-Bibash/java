import java.util.Scanner;

public class SimpleIntrest {
    //method which are static are written after main class(SimpleInterest) and also as our compiler follows buttom up approach to prevent the error we write the method here..
    public static float simple(int p,int t,int r){
        float si=(p*t*r)/100;
        return si;
    }
    public static void main(String args[]) {
        // attributes
        int p;
        int t;
        int r;
        // make a scanner object to make an input command
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter p");
        p = scanner.nextInt();
        System.out.println("enter t");
        t=scanner.nextInt();
        System.out.println("enter rate");
        r=scanner.nextInt();
        //1System.out.println("simple intrest ");
        //call the function 
        System.out.println("simple interest is \n"+simple(p,t,r));

    }
}