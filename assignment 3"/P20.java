import java.util.Scanner;

class P20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
         System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Before swap first number is: "+num1);
        System.out.println("Before swap second number is: "+num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swap first number is: "+num1);
        System.out.println("After swap second number is: "+num2);
        
        sc.close();
    }
}