import java.util.Scanner;
class P20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        int i=0,a=7;
        while(i<n){
            System.out.println(a*i+" ");
            i++;
        }
        sc.close();
    }
}