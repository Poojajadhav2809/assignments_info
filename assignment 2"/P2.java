import java.util.Scanner;
class P2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter area of rectangle");
        int area=sc.nextInt();
        System.out.println("enter breadth of rectangle");
        int b=sc.nextInt();
        sc.close();

        int l=area/b;
        System.out.println("length of the rectangle is: "+l);

        int p=2*(l+b);
        System.out.println("perimeter of the rectangle is: "+p);
    }



    }
