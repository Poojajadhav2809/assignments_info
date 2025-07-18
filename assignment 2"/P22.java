import java.util.Scanner;
class P22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of pond");
        int l=sc.nextInt();
        System.out.println("enter width of pond");
        int w=sc.nextInt();
        System.out.println("enter height of pond");
        int h=sc.nextInt();
        short v=(short)(l*w*h);
        System.out.println("the capacity of pond is: "+v);
        sc.close();
    }
}