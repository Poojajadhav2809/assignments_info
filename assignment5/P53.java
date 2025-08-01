import java.util.Scanner;
class P53{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<=n2){
            int sum=0,a=n1;
        while(a>0){
            int digit=a%10;
            int i=1,c=1;
             while(i<=digit){
                c=c*i;
                i++;
            }
            a=a/10;
            sum+=c;
            }
            if(sum==n1)
            System.out.println(sum);
            n1++;}
            sc.close();
        }
}
