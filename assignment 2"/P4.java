import java.util.Scanner;
class P4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter length of land");
        int l=sc.nextInt();

        System.out.println(" enter breadth of land");
        int b=sc.nextInt();

        System.out.println(" enter the value of rate per hundred meter square");
        int r=sc.nextInt();
        sc.close();



        int area=l*b;
        int cost=area*r/100;
        System.out.println("cost of tilling a rectangular plot is: $"+cost);
        
    }
}