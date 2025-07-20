import java.util.Scanner;
class P38{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any number from 1 to 7");
        int num=sc.nextInt();

        if(num>=1&&num<=7)
        {
        if(num==1)
        System.out.println("monday");
        else
        if(num==2)
        System.out.println("tuesday");
        else
        if(num==3)
        System.out.println("wednesday");
        else
        if(num==4)
        System.out.println("thursday");
        else
        if(num==5)
        System.out.println("friday");
        else
        if(num==6)
        System.out.println("saturday");
        else
        System.out.println("sunday");
        }
        else
        System.out.println("invalid number, please enter number between 1 to 7");
        sc.close();

    }
}