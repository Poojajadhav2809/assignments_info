import java.util.Scanner;
class P34{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            if(n%i==0 && i<n)
            sum=sum+i;
            i++;}
            if(sum==n)
            System.out.println("number is perfect");
            else
            System.out.println("number is not perfect");
            
        

        sc.close();
    }
}