import java.util.Scanner;
class P18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int i=2,a=1,b=2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(i<=n)
        {
            int c=a*b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
        }
        sc.close();
    }
}