import java.util.Scanner;
class P51{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        while(n1<=n2){
            int rev=0,a=n1;
        while(a>0){
         int digit=a%10;
         if(digit==0&&rev==0)
         System.out.print("0");
        rev=rev*10+digit;
        a=a/10;
    }
    System.out.println(rev+" "+n1);
    n1++;}
    sc.close();
}
}