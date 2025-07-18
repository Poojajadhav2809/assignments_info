import java.util.Scanner;
class P10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of base of triangle");
        double base=sc.nextDouble();

        System.out.println("enter the value of perpendicular of triangle");
        double perpendicular=sc.nextDouble();

        double area=(base*perpendicular)/2;
        System.out.println("area of triangle is: "+area);
        sc.close();
    }
}