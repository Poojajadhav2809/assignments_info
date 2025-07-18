import java.util.Scanner;
class P33{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter total length of the garden");
        int tlength=sc.nextInt();
        System.out.println("enter total width of the garden");
        int twidth=sc.nextInt();
        System.out.println("enter width of first pathway");
        int pwidth1=sc.nextInt();
        System.out.println("enter width of second pathway");
        int pwidth2=sc.nextInt();
        float lenof1part=(float)(tlength-pwidth1)/2;
        float widof1part=(float)(twidth-pwidth2)/2;
        float areaof1part=(lenof1part*widof1part);
        float totalusearea=(4*areaof1part);
        System.out.println("the total usable area of the garden is: "+totalusearea);
        sc.close();
    }
}