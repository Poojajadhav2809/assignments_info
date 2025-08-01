import java.util.Scanner;
class P16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int i=-n;
        while(i<=n)
        {
            System.out.println(i);
            i=i+3;
        }
        sc.close();
    }
}