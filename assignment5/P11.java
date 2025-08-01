import java.util.Scanner;
class P11{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms you want ");
        int n=sc.nextInt();
        int i=0;
        while(i<=n-1){
         int result=i*2+1;
         System.out.println(result);
         i++;  
        }
        sc.close();
    } 
}