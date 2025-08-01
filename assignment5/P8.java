import java.util.Scanner;
class P8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms in your series");
        int n=sc.nextInt();
        int i=1,a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(i<=n-2)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
            
        }sc.close();
    }
}