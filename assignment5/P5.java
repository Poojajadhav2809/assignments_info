import java.util.Scanner;
class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose factorial you want");
        int n=sc.nextInt();
        int i=1,fact=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("factorial of "+n+" is: "+fact);
        sc.close();
}
}