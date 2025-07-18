import java.util.Scanner;
class P24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of brickin cm");
        int brl=sc.nextInt();
        System.out.println("enter breadth of brick in cm");
        float brb=sc.nextFloat();
        System.out.println("enter height of brick in cm");
        int brh=sc.nextInt();
        System.out.println("enter length of wall in meter");
        int wlinmeter=sc.nextInt();
        System.out.println("enter breadth of wall in meter");
        float wbinmeter=sc.nextFloat();
        System.out.println("enter height of wall in meter");
        int whinmeter=sc.nextInt();
        float brv=brl*brb*brh;
        int wl=(wlinmeter*100);
        int wh=(whinmeter*100);
        int wb=(int)(wbinmeter*100);
        int wv=(wl*wh*wb);
        float numofbrick=wv/brv;
        System.out.println("number of bricks needed: "+numofbrick);
        float cost=(numofbrick*900)/1000;
        System.out.println("total cost: $"+cost);
        sc.close();
       
}
}