import java.util.Scanner;
class P47{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<=n2){
            int i=1;
        while(i<=10)
        {
            System.out.print(n1*i+" ");
            i++;
        }
        System.out.println( );
        n1++;
        sc.close();
        }
    }

}