import java.util.Scanner;
class P28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of the carpet");
        int length=sc.nextInt();
        System.out.println("enter breadth of the carpet");
        int breadth=sc.nextInt();
         int area=(length*breadth);
         int cost=(area*205);
      System.out.println("the price of the carpet is: $"+cost);  
      sc.close();
    }

}