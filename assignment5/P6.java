import java.util.Scanner;
class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose factor you want");
        int n= sc.nextInt();
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            System.out.println(i);
            i++;        }
            sc.close();
    }
}