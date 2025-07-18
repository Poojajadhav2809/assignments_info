import java.util.Scanner;
class P39{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter diameter of the cylinder");
        int d=sc.nextInt();
        System.out.println("enter height of the cylinder");
        int h=sc.nextInt();
        int r=(d/2);
        float sarea=(float)(2*3.14*r*(r+h));
        System.out.println("serface area of cylinder: "+sarea);
        sc.close();
}
}