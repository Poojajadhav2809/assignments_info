import java.util.Scanner;
class P3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("please enter your salary");
        double salary=sc.nextDouble();

        System.out.println("enter total service year you have completed");
        double year=sc.nextDouble();

        if(year>5){
          double bonus=(salary*5/100);
          System.out.println("your net bonus ammount is: "+bonus);
        }else
        System.out.println("you are not eligible for the bonus");
        sc.close();
    }
}