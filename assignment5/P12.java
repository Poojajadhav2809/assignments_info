import java.util.Scanner;
class P12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number upto you want series");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2!=0)
            System.out.print(i+" ");
            i++;
        }
        sc.close();
    }
}