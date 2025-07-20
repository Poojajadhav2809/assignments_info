import java.util.Scanner;
class P21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
         float num1=sc.nextFloat();
        
        System.out.println("enter second number");
         float num2=sc.nextFloat();

        if(num1>num2)
        System.out.println("greater number is: "+num1);
        else
        System.out.println("greater number is: "+num2);
        sc.close();
    }
    
}