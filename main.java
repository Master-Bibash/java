import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int number1=scanner.nextInt();
        System.out.println("enter second number");
        int number2=scanner.nextInt();
        check(number1,number2);
    
    }

static void check(int num1,int num2){
    if(num1>num2)
    {
        System.out.println(num1+" is bigger ");
    }
    else{
        System.out.println(num2+" is bigger");
    }
}
}