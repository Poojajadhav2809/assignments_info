import java.util.Scanner;
class P9{
       public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

         System.out.println("enter any character from alphabet");
         int character=sc.next().charAt(0);
         if(character>=97&&character<=122)
         System.out.println("the character is in lower case");
         else
         if(character>=65&&character<+90)
         System.out.println("the character is in upper case");
         else
         System.out.println("you entered invalid character,please enter character from alphabet");
         sc.close();
       }
}