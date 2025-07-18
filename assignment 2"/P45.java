import java.util.Scanner;
class P45{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first term of the series");
        int a=sc.nextInt();
        System.out.println("enter second term of the series");
        int b=sc.nextInt();
        System.out.println("enter total numver of terms");
        int n=sc.nextInt();
        int d=(b-(a));
        int sum=(int)(n/2*((2*a)+(n-1)*d));
        System.out.println("sum of nth terms of series is: "+sum);
        sc.close();
    }
}
