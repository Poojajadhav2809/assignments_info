import java.util.Scanner;
class P32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any number");
        float num=sc.nextFloat();

        if(num>0)
        System.out.println("the sign of number you entered is: +");
        else
        if(num<0)
        System.out.println("the sign of number you entered is: -");
        else
        System.out.println("your number is nuetral");
        sc.close();

    }
}