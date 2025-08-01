import java.util.Scanner;
class P38{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int a=n,sum=0,count=0,b=n;
        while(n>0){
            count+=1;
            n=n/10;
        }
        while(a>0){
            int digit=a%10;
            double cube=Math.pow(digit,count);
            sum+=cube;
            a=a/10;
        }
        System.out.println(sum);
        if(sum==b)
        System.out.print("arnstrong");
        else
        System.out.print("number is not arnstrong");
        sc.close();
    }
}