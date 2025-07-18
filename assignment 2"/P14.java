import java.util.Scanner;
class P14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of one diagonal of quadrilateral");
        int dig=sc.nextInt();
        System.out.println("enter first perpendicular side of quadrilateral");
        int per1=sc.nextInt();
        System.out.println("enter second perpendicular side of quadrilateral");
        int per2=sc.nextInt();

        float area=(float)(0.5*dig*(per1+per2));
        System.out.println("area of quadrilateral field is: "+area);
        sc.close();
    }
}