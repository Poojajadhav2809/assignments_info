import java.util.Scanner;
class P2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        sc.close();
    }
}