/*Mobile Phone Store
Create a class Mobile with fields: brand, model, price.
Use setters to set values. Create a method to check if phone is affordable (price < 20000).
*/
import java.util.Scanner;
class Mobile{
    private String brand;
    private String model;
    private float price;
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setPrice(float price){
        this.price=price;
    }

    public void Affordable(){
        if(price<20000)
        System.out.println("mobile is affordable");
        else
        System.out.println("mobile is not affordable");
    }
    public void display(){
        System.out.println("brand of the mobile is: "+brand);
        System.out.println("model of the mobile is: "+model);
    }

}
class P8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the brand name of the mobile");
        String brand=sc.nextLine();
        System.out.println("enter model of the mobile");
        String model=sc.next();
        System.out.println("enter price of the mobile");
        float price=sc.nextFloat();

        Mobile obj=new Mobile();
        obj.setBrand(brand);
        obj.setModel(model);
        obj.setPrice(price);
        obj.display();
        obj.Affordable();
        
        sc.close();
    }
}