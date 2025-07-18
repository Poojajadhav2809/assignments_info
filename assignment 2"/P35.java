import java.util.Scanner;
class P35{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter height of cylinder");
        int h=sc.nextInt();
        System.out.println("enter radius of cylinder");
        float r=sc.nextFloat();
        double surfarea=(2*3.14*r)*(r+h);
      System.out.println("surface area of cylinder: "+surfarea);
      sc.close();
}
}