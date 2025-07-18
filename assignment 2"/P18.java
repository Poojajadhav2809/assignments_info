import java.util.Scanner;
class P18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of park in meter");
        int length=sc.nextInt();
        System.out.println("enter breadth of park");
        int breadth=sc.nextInt();
        System.out.println("enter number of rounds ron cover in meter");
        int num=sc.nextInt();
        int parimeter=(2*(length+breadth));
        double total=(double)(parimeter*num);
        System.out.println(total);
        double totalkm=(double)(total/1000);
        System.out.println("toatal distance ron cover in km is: "+totalkm);
        sc.close();

    }
}