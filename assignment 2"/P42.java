import java.util.Scanner;
class P42{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter diameter of cylinder");
        float d=sc.nextFloat();
        System.out.println("enter height of cylinder");
        float h=sc.nextFloat();
        float r=d/2;
      double v=3.14*r*r*h;
      System.out.println("volume of cylinder: "+v);  
     sc.close();

    }
}