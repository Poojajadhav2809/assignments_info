import java.util.Scanner;
class P52{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<=n2){
            int a=n1,sum=0,count=0,b=n1;
        while(a>0){
            count+=1;
            a=a/10;
        }
        while(b>0){
            int digit=b%10;
            double cube=Math.pow(digit,count);
            sum+=cube;
            b=b/10;
        }
        if(sum==n1)
        System.out.println(sum);
        n1++;
        }
        sc.close();
    }

}
        