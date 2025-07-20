import java.util.Scanner;
class P37{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int num=sc.nextInt();
     if(num%5==0)
     if(num%11==0)
     System.out.println("number is divisible by both 5 and 11");
     else
     System.out.println("number is not divisible by 5 and 11");
     sc.close();   
    }
}