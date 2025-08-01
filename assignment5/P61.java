// WAP to find out all the leap years between two entered years
import java.util.Scanner;
class P61{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two years");
        int year1=sc.nextInt();
        int year2=sc.nextInt();
        while(year1<=year2){
        if((year1%400==0&&year1%100==0)||year1%4==0)
        System.out.println(year1);
        year1++;
        }
        sc.close();
    }
}
