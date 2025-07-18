import java.util.Scanner;
class P23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of carton");
        int crl=sc.nextInt();
        System.out.println("enter breadth of carton");
        int crb=sc.nextInt();
        System.out.println("enter height of carton");
        int crh=sc.nextInt();
        int crv=(crl*crb*crh);
        System.out.println("enter side of cubical box");
        int cside=sc.nextInt();
        int cv=(cside*cside*cside);
        int numofcube=(crv/cv);
        System.out.println("number of cubical boxes accommodated in carton is: "+numofcube); 
        sc.close();

        }
}