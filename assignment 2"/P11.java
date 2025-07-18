import java.util.Scanner;
class P11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter base part of ratio");
        int rbase=sc.nextInt();
        System.out.println("enter height part of ratio");
        int rheight=sc.nextInt();

        System.out.println("enter area of triangle");
        int area=sc.nextInt();

         double commonmul=(Math.sqrt(area/(rbase*rheight)));
         System.out.println(commonmul);
         System.out.println("the base of triangle is: "+(rbase*commonmul));
         System.out.println("the height of triangle is: "+(rheight*commonmul));
         sc.close();
}
}