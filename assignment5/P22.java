import java.util.Scanner;
class P22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i*i*i+" ");
            i++;
        }
        sc.close();
    }
}