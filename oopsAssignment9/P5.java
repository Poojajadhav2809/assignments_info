/*Product Inventory
Create a class Product with fields: productId, name, quantity, price.
Use setters to assign values. Add a method to calculate total value (quantity * price).
*/
import java.util.Scanner;
class Product {
    private int productId;
    private String name;
    private int quantity;
    private double price;

    public double total(){
        return quantity*price; 
    }

    public void display(){
        System.out.println("product id is: "+productId);
        System.out.println("product name is: "+name);
    }
    

    public void setProductId(int productId){
        this.productId=productId;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
}
class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("product id");
        int productId=sc.nextInt();
        System.out.println("enter product name");
        String name=sc.next();
        System.out.println("enter product quantity");
        int quantity=sc.nextInt();
        System.out.println("enter product price");
        double price=sc.nextDouble();

    Product obj=new Product();
    obj.setProductId(productId);
    obj.setName(name);
    obj.setQuantity(quantity);
    obj.setPrice(price);
    obj.display();
     double result=obj.total();
    System.out.println("total payment is: "+result);
    sc.close();
}

}
