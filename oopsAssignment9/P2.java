/*Book Library
Create a class Book with fields: title, author, and price.
Use setters to assign values and a method to print book details.
 */
class Library {
    private String title;
    private String author;
    private int price;

    public void display(){
        System.out.println("title of book: "+title);
        System.out.println("Name of author: "+author);
        System.out.println("Price of book: "+price);
    }
    public void setTitle(String title){
        this.title=title;

    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(int price){
        this.price=price;
    }
    }
class P2{
    public static void main(String args[]){
    Library obj=new Library();
    obj.setTitle("Swami vivekanad");
    obj.setAuthor("ramkrishna mission institute");
    obj.setPrice(500);
    obj.display();
}

}
