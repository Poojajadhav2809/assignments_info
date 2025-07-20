import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of rectangle");
        int length=sc.nextInt();

        System.out.println("enter breadth of rectangle");
        int breadth=sc.nextInt();

        if(length==breadth)
        System.out.println("it is a square");
        else
        System.out.println("it is not a square");
        sc.close();
    }
}