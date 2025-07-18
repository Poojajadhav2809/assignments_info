import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter perimeter of rectangle: ");
        int p= sc.nextInt();

        System.out.println("Enter length of rectangle: ");
        int l= sc.nextInt();
        sc.close();

        int b=((p/2)-l);
        System.out.println("the breadth of rectangle is: "+b);

        int area=(l*b);
        System.out.println("the area of rectangle is: "+area);
    }
}