import java.util.Scanner;
class P3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of tile");
        int tlength=sc.nextInt();

        System.out.println("enter breadth of tile");
        int tbreadth=sc.nextInt();

        System.out.println("enter length of rectangular region");
        int rlength=sc.nextInt();
        System.out.println("enter breadth of rectangular region");
        int rbreadth=sc.nextInt();

        int numoftiles=(rlength*rbreadth)/(tlength*tbreadth);
        System.out.println("number of tiles needed to cover a given rectangular region are "+numoftiles);

        sc.close();

    }
}