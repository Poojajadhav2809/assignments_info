import java.util.Scanner;
class P37{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter total surface area of cylinder");
        int tsa=sc.nextInt();
        System.out.println("enter height of cylinder");
        int h=sc.nextInt();
        double a=(double)(2*3.14);
        double b=(double)(2*3.14*h);
        double c=(double)(tsa);
        double dis=Math.sqrt((b*b)-(4*a*(-c)));
        double r1=(-b+dis)/(2*a);
        double r2=(-b-dis)/(2*a);
        double d1=r1+r1;
        double d2=r2+r2;
        if(d1>d2){
            System.out.println("diameter of cylinder:"+d1);
        }else{
            System.out.println("diameter of cylinder:"+d2);
        }
        sc.close();

    }
}