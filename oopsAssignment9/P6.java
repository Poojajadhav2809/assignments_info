/*Movie Rating System
Create a class Movie with fields: name, genre, and rating.
Use setters and create a method isHit() that returns true if rating ≥ 8.0.
*/
import java.util.Scanner;
class Movie{
    private String name;
    private String genre;
    private float rating;
    
    public void setName(String name){
        this.name=name;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public void setRating(float rating){
        this.rating=rating;
    }

    public boolean isHit(){
        if(rating>=8.0)
        return true;
        return false;
    }
    public void display(){
        System.out.println("name of the movie is: "+name);
        System.out.println("genre of the movie is: "+genre);
    }

}
class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the movie");
        String name=sc.nextLine();
        System.out.println("enter genre of the movie");
        String genre=sc.next();
        System.out.println("enter rating of the movie");
        float rating=sc.nextFloat();

        Movie obj=new Movie();
        obj.setName(name);
        obj.setGenre(genre);
        obj.setRating(rating);
        obj.display();
        boolean result=obj.isHit();
        System.out.println("rating of the movie is: "+result);
        sc.close();
    }
}