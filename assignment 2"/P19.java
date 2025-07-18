import java.util.Scanner;
class P19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the edge of cube");
        int cedge=sc.nextInt();

        System.out.println("enter the length  of cuboid");
        int cdlength=sc.nextInt();
        System.out.println("enter the breadth  of cuboid");
        int cdbreadth=sc.nextInt();
        System.out.println("enter the height  of cuboid");
        int cdheight=sc.nextInt();
        int cvolume=(cedge*cedge*cedge);
        int cdvolume=(cdlength*cdbreadth*cdheight);
        if(cdvolume>cvolume){
        System.out.println("cuboid has more volume ");
        }else{
        System.out.println("cube has more volume");
      }
      sc.close();
        
        }
}