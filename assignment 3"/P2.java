import java.util.Scanner;
class P2{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of quantity");
        int quantity=sc.nextInt();

        int payment=quantity*100;

        if(payment>1000){
            int dispayment=(payment-(payment*10/100));
            System.out.println("total cost for the user is: "+dispayment);
        }else
        System.out.println("toatal cost for the user is: "+payment);
        sc.close();
        

        
    }
}