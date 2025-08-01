import java.util.Scanner;
class P48{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        
        while(n1<=n2){
            int i=1;
        while(i<=n1)
        {
            if(n1%i==0)
            System.out.print(i+" ");
            i++;        }
            System.out.println();
            
        n1++;}
        sc.close();
    }
}