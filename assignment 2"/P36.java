import java.util.Scanner;
class P36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter diameter of the cylinder");
        int d=sc.nextInt();
        System.out.println("enter height of the cylinder");
        int h=sc.nextInt();
        float r=(float)(d/2);
      double surfarea=(2*3.14*r)*(r+h);
      System.out.println("surface area of cylinder: "+surfarea);
      sc.close();
    }
}
