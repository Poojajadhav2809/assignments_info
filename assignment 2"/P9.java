import java.util.Scanner;
class P9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length side of euilateral triagle");
        int side=sc.nextInt();

        double area=(1.732/4)*side*side;
        System.out.println("area of equilateral triagle is: "+area);
        sc.close();
        }
}

