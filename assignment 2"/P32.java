import java.util.Scanner;
class P32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter side of the garden");
        int gside=sc.nextInt();
        System.out.println("enter side of the swimming pool");
        int spside=sc.nextInt();
        int totalarea=gside*gside;
        int sparea=(spside*spside);
      int garea=totalarea-sparea;
      System.out.println("area of garden: "+garea);
        sc.close();

    }
}