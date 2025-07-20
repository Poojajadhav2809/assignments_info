import java.util.Scanner;
class P36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first angle of the triangle");
        int angle1=sc.nextInt();
         System.out.println("enter second angle of the triangle");
         int angle2=sc.nextInt();
         System.out.println("enter third angle of the triangle");
        int angle3=sc.nextInt();
        int sum=angle1+angle2+angle3;
        if(sum==180)
        System.out.println("the triangle is valid");
        else
        System.out.println("the triangle is Invalid");
        sc.close();
    }
}