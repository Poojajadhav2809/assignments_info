import java.util.Scanner;
class P31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int i=9;
        while(n>0){
        System.out.print(i+" ");
         i=i*10+9;
         n--;
        }
        sc.close();
    }
}