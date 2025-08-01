import java.util.Scanner;
class P7{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int i=1,counter=0;
       System.out.println("enter the number you want to check prime or not");
       int n=sc.nextInt();
       while(i<=n)
       {
        if(n%i==0){
        counter=counter+1;
        }
        i++;
    }
       if(counter==2)
       System.out.println("prime");
       else
       System.out.println("not prime");
       sc.close();


    }
}