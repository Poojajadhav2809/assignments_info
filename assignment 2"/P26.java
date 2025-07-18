import java.util.Scanner;
class P26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of brick");
        int lofbrick=sc.nextInt();
        System.out.println("enter breadth of brick");
        int bofbrick=sc.nextInt();
        System.out.println("enter length of path in meter");
        int lofpathinmeter=sc.nextInt();
        System.out.println("enter breadth of path in meter");
        float bofpathinmeter=sc.nextFloat();
        float lofpathincm=(float)(lofpathinmeter*100);
        double bofpathincm=(double)(bofpathinmeter*100);
        double numofbricks=(double)(lofpathincm*bofpathincm)/(lofbrick*bofbrick);
        System.out.println("number of bricks required to lay a path: "+numofbricks);
        sc.close();
        
}
}