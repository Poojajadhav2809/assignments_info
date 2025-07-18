import java.util.Scanner;
class P13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter area of right angle triangle");
        int area=sc.nextInt();
        System.out.println("enter the value of one of triangle leg");
        int leg1=sc.nextInt();
        int leg2=(2*area)/leg1;
        System.out.println("the length of other leg is: "+leg2);
        sc.close();
    }


    }
