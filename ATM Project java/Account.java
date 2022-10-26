import java.text.DecimalFormat;
import java.util.Scanner;

import org.w3c.dom.events.MouseEvent;

public class Account{
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingbalance=0;

    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;

    }
    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
        
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingbalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingbalance=(savingbalance-amount);
        return savingbalance;
    }
    public double calcCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingbalance=(savingbalance+amount);
        return savingbalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("checking account balance: "+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking amount :");
        double amount=input.nextDouble();
        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account balance "+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("balance cannot be negative+\n");
        }
    }
    public void getSavingWithdrawInput(){
        System.out.println("saving account balance: "+moneyFormat.format(savingbalance));
        System.out.println("Amount you want to withdraw from saving amount :");
        double amount=input.nextDouble();
        if((savingbalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New saving Account balance "+moneyFormat.format(savingbalance));
        }else{
            System.out.println("balance cannot be negative+\n");
        }
    }
    public void getCheckingDepositinput(){
        System.out.println("Checking account balance: "+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking amount :");
        double amount=input.nextDouble();
        if((checkingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New checking Account balance "+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("balance cannot be negative+\n");
        }
    }
    public void getSavingDepositinput(){
        System.out.println("Saving account balance: "+moneyFormat.format(savingbalance));
        System.out.println("Amount you want to deposit from saving amount :");
        double amount=input.nextDouble();
        if((savingbalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("New saving Account balance "+moneyFormat.format(savingbalance));
        }else{
            System.out.println("balance cannot be negative+\n");
        }
    }


}