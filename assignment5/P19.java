import java.util.Scanner;
class P19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        double i=1,a=1;
        double sum=0;
        while(i<=n){
            sum=sum+a/i;
            i++;
        }
        System.out.println("sum os the series is"+sum);
        sc.close();
    }
}