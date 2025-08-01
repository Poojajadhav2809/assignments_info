import java.util.Scanner;
class P30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int i=1,sum=0;
        while(n>0){
         i=i*10+1;
        sum+=i;
         n--;
        }
        System.out.print("sum is: "+sum);
        sc.close();
    }
}