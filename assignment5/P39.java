import java.util.Scanner;
class P39{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0,a=n;
        while(n>0){
            int digit=n%10;
            int i=1,c=1;
            System.out.println(digit);
             while(i<=digit){
                c=c*i;
                i++;
            }
            n=n/10;
            System.out.println(i);
            System.out.println(c);
            sum+=c;
            }
        System.out.println(sum);
        if(a==sum)
        System.out.print("number is strong");
        else
        System.out.print("number is not strong");
        sc.close();
    }
}