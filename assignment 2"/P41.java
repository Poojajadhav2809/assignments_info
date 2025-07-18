import java.util.Scanner;
class P41{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter diameter of cylinder");
        int d=sc.nextInt();
        System.out.println("enter height of cylinder");
        int h=sc.nextInt();
        float r=(float)(d/2);
        double v=(3.14*r*r*h);
        System.out.println("volume of cylinder is: "+v);  
        sc.close();
    }
}