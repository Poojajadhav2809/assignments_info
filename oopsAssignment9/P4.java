/*Car Info Manager
Create a class Car with fields: brand, model, and year.
Use setters to assign values. Create a method to print full car info.*/
import java.util.Scanner;
class Car {
    private String brand;
    private String model;
    private int year;

    public void display(){
        System.out.println("brand of the car is: "+brand);
        System.out.println("model of the car is: "+model);
        System.out.println("starting year of car is: "+year);
    }

    public void setBrand(String brand){
        this.brand=brand;

    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    
}
class P4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter car brand");
        String brand=sc.next();
        System.out.println("enter car model");
        String model=sc.next();
        System.out.println("enter car manufacturing year");
        int year=sc.nextInt();

    Car obj=new Car();
    obj.setBrand(brand);
    obj.setModel(model);
    obj.setYear(year);
    obj.display();
    sc.close();
}

}
