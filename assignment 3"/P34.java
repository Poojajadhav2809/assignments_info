import java.util.Scanner;

class P34{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all three sides measure:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("Given triangle is equilateral.");
        }
        else if((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("Given triangle is isosceles.");
        } else 
            System.out.println("Given triangle is scalen.");
        sc.close();
    }
}