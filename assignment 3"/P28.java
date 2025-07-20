import java.util.Scanner;
class P28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();

        System.out.println("enter operation \n 1 for + \n 2 for -\n 3 for *\n 4 for /\n 5 for %");
        int choice=sc.nextInt();

        switch(choice){
            case 1: System.out.println("sum is: "+(num1+num2));break;
            case 2: System.out.println("difference is:"+(num1-num2));break;
            case 3: System.out.println("multiplication is:"+(num1*num2));break;
            case 4: System.out.println("division is:"+(num1/num2));break;
            case 5: System.out.println("remainder is:"+(num1%num2));
            break;
            default:System.out.println("invalid choice");
            }
            sc.close();
}
}