//WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner;
class P60{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter last number");
        int n=sc.nextInt();
        int i=1,square=0,cube=0;
        double root=0;
        while(i<=n){
             square=i*i;
             cube=i*i*i;
             root=Math.sqrt(i);
             i++;
        }
        System.out.print(square+" "+cube+" "+root+" ");
        sc.close();
    }
}