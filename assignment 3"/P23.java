import java.util.Scanner;
class P23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the integer number");
        int num=sc.nextInt();

        if(num%2!=0)
        System.out.println("odd");
        else
        System.out.println("even");
        sc.close();
    }
}