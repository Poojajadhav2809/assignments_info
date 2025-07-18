import java.util.Scanner;
class P40{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter radius of cylinder");
        int r=sc.nextInt();
        System.out.println("enter height of cylinder");
        int h=sc.nextInt();
        double v=3.14*r*r*h;
      System.out.println("volume of cylinder is: "+v); 
      sc.close(); 
    }

    }
