import java.util.Scanner;
class P12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter hypotenous of the triangle");
        int hypo=sc.nextInt();
        System.out.println("enter side of triangle that contain right angle");
        int perpendicular=sc.nextInt();

        double base=Math.sqrt((hypo*hypo)-(perpendicular*perpendicular));
        double area=(base*perpendicular)/2;
        System.out.println("length of the other side is: "+base);
        System.out.println("area of triangle is: "+area);
        sc.close();
}
}