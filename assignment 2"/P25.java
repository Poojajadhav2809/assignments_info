import java.util.Scanner;
class P25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of brick");
        int length=sc.nextInt();
        System.out.println("enter breadth of brick");
        int breadth=sc.nextInt();

        int areaofbrick=(length*breadth);
        int areaofpath=areaofbrick*100;
        System.out.println("area of path is: "+areaofpath);
        sc.close();
    }

}