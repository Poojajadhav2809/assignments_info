import java.util.Scanner;
class P17{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number upto you want series");
        int n=sc.nextInt();
        int i=0,a=1;
        while(i<=n-1){
            a=a+i;
            System.out.print(a+" ");
            
            i++;
        }
        sc.close();
    }
}