import java.util.Scanner;
class P45{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}