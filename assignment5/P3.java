import java.util.Scanner;
class P3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms you want to sum");
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
         System.out.println("sum of the numbers is "+sum);
         sc.close();

    }
}