import java.util.Scanner;
class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any number");
        double number=sc.nextDouble();

        double absvalue=(number<0)? -number :number;
        System.out.println("the absolute value of the given number is: "+absvalue);
        sc.close();
    }
}