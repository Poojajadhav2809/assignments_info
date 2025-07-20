import java.util.Scanner;
class P25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number between 1 to 5");
        int num=sc.nextInt();

        if(num>=1&&num<=5)
        {
            if(num==1)
            System.out.println("one");
            else
            if(num==2)
            System.out.println("two");
            else
            if(num==3)
            System.out.println("three");
            else
            if(num==4)
            System.out.println("four");
            else
            System.out.println("five");
        }
        else
        System.out.println("invalid number");
        sc.close();
    }
}