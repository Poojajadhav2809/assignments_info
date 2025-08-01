import java.util.Scanner;
class P42{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int i=1,c=0;
        while(i<=n1){
            if(n1%i==0&&n2%i==0)
            c=i;
            i++;
        }
        System.out.println(c);
        sc.close();
    }
}