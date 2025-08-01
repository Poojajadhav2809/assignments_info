import java.util.Scanner;
class P13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms you want to print");
        int n=sc.nextInt();
        int i=1;
        while(n>=i){
            System.out.print(n+" ");
            n--;
        }
        sc.close();
    }
}