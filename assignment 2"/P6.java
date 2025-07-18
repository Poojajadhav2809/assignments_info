import java.util.Scanner;
class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first side of triangle");
         int side1=sc.nextInt();
        System.out.println("enter second side of triangle");
         int side2=sc.nextInt();
         System.out.println("enter perimeter of triangle");
         int perimeter=sc.nextInt();
         int side3=(byte)(perimeter-(side1+side2));
        int semip=((side1+side2+side3)/2);
        float area=(float)(Math.sqrt(semip*(semip-side1)*(semip-side2)*(semip-side3)));
        System.out.println("area of triangle is "+area);
        sc.close();
         
         
         
    }
}