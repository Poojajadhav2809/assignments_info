import java.util.Scanner;
class P20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of the brick");
        int length=sc.nextInt();
        System.out.println("enter breadth of the brick");
        int breadth=sc.nextInt();
        System.out.println("enter height of the brick");
        int height=sc.nextInt();
        int volume=(length*breadth*height);
        System.out.println("the volume of brick of ice-cream is: "+volume);
        sc.close();

    }
}