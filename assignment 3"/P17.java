import java.util.Scanner;
class P17{
       public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

         System.out.println("enter length of rectangle");
         double length=sc.nextDouble();

         System.out.println("enter breadth of rectangle");
         double breadth=sc.nextDouble();

         double area=length*breadth;
         System.out.println("area of rectangle is: "+area);
         sc.close();
       }
}