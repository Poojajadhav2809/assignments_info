import java.util.Scanner;
class P19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter two value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        System.out.println("value before swapping: "+a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("values after swapping: "+a+" "+b);

        System.out.println("again enter two number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("numbers before swapping: "+num1+" "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("numbers after swapping: "+num1+" "+num2);
        sc.close();
    }
}