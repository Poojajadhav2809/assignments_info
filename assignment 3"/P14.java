import java.util.Scanner;
class P14{
       public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

         System.out.println("enter your percentage");
         double percentage=sc.nextDouble();

         if(percentage>90)
         System.out.println("your grade is A");
         else
         if(percentage>80&&percentage<=90)
         System.out.println("your grade is B");
         else
         if(percentage>=60&&percentage<=80)
         System.out.println("your grade is C");
         else
         System.out.println("your grade is D");

         sc.close();
       }
}