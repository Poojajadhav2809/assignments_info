import java.util.Scanner;
class P38{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter volume of cylinder");
        int vol=sc.nextInt();
        System.out.println("enter radius of cylinder");
        int r=sc.nextInt();
        float height=(float)(vol/(r*r*3.14));
        float sarea=(float)(2*3.14*r*(r+height));
        System.out.println("surface area of the cylinder is:"+sarea);
        sc.close();

    }
}