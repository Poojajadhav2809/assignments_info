import java.util.Scanner;
class P16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of teena's dining room");
        int dlength=sc.nextInt();
        System.out.println("enter breadth of teena's dining room");
        int dbreadth=sc.nextInt();
        int area=(dlength*dbreadth);
       System.out.println("tina need carpet to cover her dining room is: "+area);
        sc.close();
}
}