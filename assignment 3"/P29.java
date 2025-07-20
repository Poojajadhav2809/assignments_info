import java.util.Scanner;
class P29{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        float num1=sc.nextFloat();
        System.out.println("enter second number");
        float num2=sc.nextFloat(); 
        System.out.println("enter third number");
        float num3=sc.nextFloat();
        System.out.println("enter fourth number");
        float num4=sc.nextFloat();

        if(num1<num2&&num1<num3&&num1<num4)
            System.out.println("smallest number is: "+num1 );
            else
            if(num2<num1&&num2<num3&&num2<num4)
            System.out.println("smallest number is: "+num2 );
            else
            if(num3<num1&&num3<num2&&num3<num4)
            System.out.println("smallest number is: "+num3 );
            else
            System.out.println("smallest number is: "+num4);
            sc.close();

        }
}