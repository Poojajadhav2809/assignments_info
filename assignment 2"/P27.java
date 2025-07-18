import java.util.Scanner;
class P27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of dining room");
        int length=sc.nextInt();
        System.out.println("enter breadth of dining room");
        int breadth=sc.nextInt();
        int area=(length*breadth);
        int cost=(area*5);
        System.out.println("the cost of tiling dining room is: $"+cost);
        sc.close();
    }
}