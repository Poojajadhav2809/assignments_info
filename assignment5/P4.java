import java.util.Scanner;
class P4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose table you want to print");
        int n=sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n*i);
            i++;
        }
        sc.close();
    }
}