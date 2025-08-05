/*Rectangle Area Calculator
Create a class Rectangle with fields: length, width.
Use setters to assign values. Add a method to calculate area. */
import java.util.Scanner;
class Rectangle{
    private float length;
    private float breadth;

    public void setLength(float length){
        this.length=length;
    }

    public void setBreadth(float breadth){
        this.breadth=breadth;
    }

    public float Area(){
        return length*breadth;
    }
}
class P10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of the rectangle");
        float length=sc.nextFloat();
        System.out.println("enter breadth of rectangle");
        float breadth=sc.nextFloat();

        Rectangle obj=new Rectangle();
        obj.setLength(length);
        obj.setBreadth(breadth);
         float area=obj.Area();
         System.out.println("area of rectangle is: "+area);
         sc.close();
    }
    
}
