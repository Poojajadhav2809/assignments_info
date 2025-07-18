import java.util.Scanner;
class P21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of brick in cm");
        int brl=sc.nextInt();
        System.out.println("enter breadth of brick in cm");
        int brb=sc.nextInt();
        System.out.println("enter height of brick in cm");
        int brh=sc.nextInt();
        int brv=(brl*brb*brh);
        System.out.println("enter length of wall in meter");
        int wlinmeter=sc.nextInt();
        System.out.println("enter breadth of wall in meter");
        int wbinmeter=sc.nextInt();
        System.out.println("enter height of wall in meter");
        int whinmeter=sc.nextInt();
        
        int wl=(wlinmeter*100);
        int wb=(wbinmeter*100);
        int wh=(whinmeter*100);
        int wv=(wl*wb*wh);
        int brickreq=(wv/brv);
        System.out.println("number of bricks used to make a wall: "+brickreq);
        
        sc.close();
}
}