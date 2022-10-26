import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException{
        int x=1;
        do{
            try{
                data.put(123, 1234);
                data.put(952142, 123135);
                System.out.println("WELCOME TO THE ATM PROJECT !");
                System.out.println("Enter the customer number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("enter your pin Number :");
                setPinNumber(menuInput.nextInt());

            }catch (Exception e){
                System.out.println("\n +Invalid character(s).only Numbers"+"\n");
                x=2;
            }
        
        int cn=getCustomerNumber();
        int pn=getPinNumber();
        if(data.containsKey(cn) && data.get(cn)==pn){
            getAccountType();
        }else{
            System.out.println("\n"+"Wrong Customer or Pin Number"+"\n");
        }
    }while(x==1);
       
    }
    


    public void getAccountType() {
        System.out.println("select the account you want to access");
        System.out.println("Type 1 -check Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3- Exit");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank You for using this ATM,bye \n");
                break;

            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getAccountType();
        }
    }

    public void getChecking() {
        System.out.println("Checking Account :");
        System.out.println("Type 1 - View balance");
        System.out.println("Type 2 - withdraw funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice : ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account balance :" + moneyFormat.format(getCheckingBalance()));
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositinput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thanks for using ATm ,bye");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getChecking();

        }
    }

    public void getSaving() {
        System.out.println("Saving account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Fund");
        System.out.println("Type 3 - Deposit Fund");
        System.out.println("Type 4 - Exit");
        System.out.println("choice :");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account balance :" + moneyFormat.format(getSavingBalance()));
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositinput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thanks for using ATm ,bye");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getChecking();

        }
    }
}