/*Circle Geometry
Create a class Circle with field radius.
Use a setter to assign radius. Add methods to compute area and circumference.
 */
import java.util.Scanner;
class Circle{
    private float radius;

    public void setRadius(float radius){
        this.radius=radius;
    }

    public double Area(){
        return (3.14*radius*radius);
    }
    public double Circumference(){
        return (2*3.14*radius);
    }
}
class P9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of the circle");
        float radius=sc.nextFloat();

        Circle obj=new Circle();
        obj.setRadius(radius);
         double area=obj.Area();
         System.out.println("area of the circle is:"+area);
         double circumference=obj.Circumference();
         System.out.println("circumference of the circle is: "+circumference);
         sc.close();
    }
}
