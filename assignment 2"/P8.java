import java.util.Scanner;
class P8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of altitude in cm");
        int altitude=sc.nextInt();
        System.out.println("enter area of triangle in meter square");
        float area=sc.nextFloat();

        area=(area*10000);
        float base=(2*area)/altitude;
        System.out.println("base of the triagle is: "+base);
        sc.close();
    }

}
