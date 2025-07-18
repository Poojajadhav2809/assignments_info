import java.util.Scanner;
class P7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter base of triangle");
        int base=sc.nextInt();
        System.out.println("enter area of triangle");
        int area=sc.nextInt();

        int height=((2*area)/base);
        System.out.println("height of triangle is: "+height);
        sc.close();

}
}