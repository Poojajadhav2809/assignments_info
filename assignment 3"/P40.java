import java.util.Scanner;
class P40{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter selling price");
        double sellp=sc.nextDouble();
        System.out.println("enter cost price");
        double costp=sc.nextDouble();

        if(sellp>costp){
        double profit=sellp-costp;
        System.out.println("you have profit of "+profit);
        }
        else{
            double loss=costp-sellp;
            System.out.println("you have loss of "+loss);
        }
        sc.close();

    }
}