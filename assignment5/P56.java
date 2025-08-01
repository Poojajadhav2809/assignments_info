import java.util.Scanner;
class P56{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<=n2){
        int i=1,fact=1;
        while(i<=n1)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("factorial of "+n1+" is: "+fact);
        n1++;
        sc.close();
}
}
}