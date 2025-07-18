import java.util.Scanner;
class P30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of tile");
        int tl=sc.nextInt();
        System.out.println("enter breadth of tile");
        int tb=sc.nextInt();
        System.out.println("enter length of floor");
        int fl=sc.nextInt();
        System.out.println("enter breadth of floor");
        int fb=sc.nextInt();
        int areaf=fl*fb;
        int areat=(tl*tb);
        int numoftiles=areaf/areat;
        System.out.println("number of tiles: "+numoftiles);
        sc.close();
    }
}