/*Create a class BankAccount with fields: accountNumber, holderName, balance.
Use setters to assign values. Add a method to display balance.*/
import java.util.Scanner;
class BankAccount {
    private int accountNumber;
    private String holderName;
    private int balance;

    public void display(){
        System.out.println("your account number is: "+accountNumber);
        System.out.println("your name is: "+holderName);
        System.out.println("your account balance is: "+balance);
    }
    public void setaccountNumber(int accountNumber){
        this.accountNumber=accountNumber;

    }
    public void setholderName(String holderName){
        this.holderName=holderName;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
    }

class P3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account number");
        int accountNumber=sc.nextInt();
        System.out.println("enter honder's name");
        String holderName=sc.next();
        System.out.println("enter account balance");
        int balance=sc.nextInt();

    BankAccount obj=new BankAccount();
    obj.setaccountNumber(accountNumber);
    obj.setholderName(holderName);
    obj.setbalance(balance);
    obj.display();
    sc.close();
}

}
