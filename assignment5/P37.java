import java.util.Scanner;
class P37{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int rev=0,a=n;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);
        if(a==rev)
        System.out.print("number is palindrome");
        else
        System.out.print("number is not palindrome");
        sc.close();
    }
}