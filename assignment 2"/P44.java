import java.util.Scanner;
class P44{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first term of the series");
        int a=sc.nextInt();
        System.out.println("enter second term of the series");
        int b=sc.nextInt();
        System.out.println("enter total numver of terms");
        int n=sc.nextInt();
        int d=(b-(a));
        int last=(byte)(a+(n-1)*d);
        System.out.println("the nth term of the series is: "+last);
        sc.close();

    }
    }
