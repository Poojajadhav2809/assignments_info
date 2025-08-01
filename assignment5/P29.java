import java.util.Scanner;
class P29{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int i=1;
        while(n>0){
        System.out.print(i+" ");
         i=i*10+1;
         n--;
        }
        sc.close();
    }
}