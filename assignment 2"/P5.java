import java.util.Scanner;
class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost to fence rectangular park");
        int cost=sc.nextInt();
        System.out.println("enter the rate of per meter square");
        int rate=sc.nextInt();

        int perimeter=cost/rate;

        System.out.println("enter length of park");
        int length=sc.nextInt();

        int breadth=(perimeter/2)-length;
        int area=length*breadth;
        System.out.println("perimeter of rectangular park "+perimeter);
        System.out.println("breadth of rectangular park "+breadth);
        System.out.println("area of rectangular park "+area);
        sc.close();
    }

    } 

