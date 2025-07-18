import java.util.Scanner;
class P17{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of luci's display board");
        int length=sc.nextInt();
         System.out.println("enter breadth of luci's display board");
        int breadth=sc.nextInt();
        int perimeter=2*(length+breadth);
        System.out.println("the length of ribbon needed is: "+perimeter);
        sc.close();
    }
}