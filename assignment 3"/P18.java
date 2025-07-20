import java.util.Scanner;
class P18{
       public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

         System.out.println("enter total marks you obtain");
          double marks=sc.nextDouble();

          System.out.println("enter total marks that exam held");
          double total=sc.nextDouble();
          if(total>=marks)
          {
          double percentage=(marks/total)*100;
          System.out.println("percentage of the student is: "+percentage);
          }
          else
          System.out.println("you entered invalid total marks that exam held");
          sc.close();

       }
}