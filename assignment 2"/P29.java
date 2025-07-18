import java.util.Scanner;
class P29{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of floor");
        int flength=sc.nextInt();
        System.out.println("enter breadth of floor");
        int fbreadth=sc.nextInt();
        System.out.println("enter side of tile");
        int tside=sc.nextInt();
        int farea=(flength*fbreadth);
        int tarea=(tside*tside);
        int numoftiles=(farea/tarea);
        System.out.println("number of tiles required: "+numoftiles);
        sc.close();

    }
}