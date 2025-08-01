import java.util.Scanner;
class P24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int c=2*i-2;
            System.out.print(c*c+" ");
            i++;
        }
        sc.close();
    }
}