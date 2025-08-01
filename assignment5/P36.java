import java.util.Scanner;
class P36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
         int digit=n%10;
         if(digit==0&&rev==0)
         System.out.print("0");
        rev=rev*10+digit;
        n=n/10;
    }
    System.out.println(rev);
        sc.close();
    }
}