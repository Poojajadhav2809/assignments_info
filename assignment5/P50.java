import java.util.Scanner;
class P50{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        while(n1<=n2){
             int rev=0,a=n1;
        while(a>0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        if(n1==rev)
        System.out.println(rev);
        n1++;
        }
        sc.close();
    }
}