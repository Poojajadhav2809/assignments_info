import java.util.Scanner;
class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the age of 1st person");
        double age1=sc.nextDouble();

        System.out.println("enter the age of 2nd person");
        double age2=sc.nextDouble();

        System.out.println("enter the age of 3rd person");
        double age3=sc.nextDouble();
        
        if(age1<age2&&age1<age3)
        System.out.println("1st person is youngest");
        else
        if(age2<age1&&age2<age3)
        System.out.println("2nd person is youngest");
        else
        System.out.println("3rd person is youngest");
        sc.close();

    }
}