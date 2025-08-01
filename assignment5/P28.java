import java.util.Scanner;
class P28{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%5==0)
            System.out.print("Hello ");
            else
            System.out.print(i+" ");
            i++;
        } 
        sc.close();
    }
}