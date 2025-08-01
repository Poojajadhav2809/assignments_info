import java.util.Scanner;
class P49{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<=n2){
            int i=1,sum=0;
        while(i<=n1){
            if(n1%i==0 && i<n1)
            sum=sum+i;
            i++;}
            if(sum==n1)
            System.out.println(sum);
            n1++;
            
        
        }
        sc.close();
    }
}