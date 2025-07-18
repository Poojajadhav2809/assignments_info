import java.util.Scanner;
class P15{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length of shelly's garden");
        int shlength=sc.nextInt();
        System.out.println("enter the breadth of shelly's garden");
        int shbreadth=sc.nextInt();
        System.out.println("enter the side of richel's garden");
        int rside=sc.nextInt();
        int sharea=(shlength*shbreadth);
        int rarea=(rside*rside);
        if(sharea>rarea){
            System.out.println("shelly's  garden area is bigger by: "+(sharea-rarea));
        }else if(rarea>sharea){
            System.out.println("richel's garden area is bigger by: "+(rarea-sharea));

        }else{
            System.out.println("both garden are same");
        
        }
        sc.close();
    }
}