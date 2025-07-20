import java.util.Scanner;
class P16{
       public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

         System.out.println("enter value of radius of the circle");
         double radius=sc.nextDouble();

         double area = radius*radius*22/7; 
        System.out.println("the area of cirle is: "+area);     
    
        sc.close();
    }
}