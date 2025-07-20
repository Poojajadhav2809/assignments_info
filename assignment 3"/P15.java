import java.util.Scanner;
class P15{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter cost price of your bike");
        Double cost=sc.nextDouble();
        double tax=0;
        if(cost>100000){
          tax=cost*15/100;
        System.out.println("your road tax is: "+tax);
        }
        else
        if(cost>50000&&cost<=100000){
            tax=cost*10/100;
            System.out.println("your road tax is: "+tax);
        }
        else
        if(cost<=50000){
        tax=cost*5/100;
        System.out.println("your road tax is: "+tax);
        }
        sc.close();
    }
}