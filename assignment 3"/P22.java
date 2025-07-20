import java.util.Scanner;
class P22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        float num1=sc.nextFloat();
        System.out.println("enter second number");
        float num2=sc.nextFloat();
        System.out.println("enter third number");
        float num3=sc.nextFloat();
        
        if(num1>num2&&num1>num3)
        System.out.println("greater number is: "+num1);
        else
        if(num2>num1&&num2>num3)
        System.out.println("greater number is: "+num2);
        else
        System.out.println("greater number is: "+num3);
        sc.close();
    }
}