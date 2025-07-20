import java.util.Scanner;

class P35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch =sc.next().charAt(0);
        System.out.println(ch);
        if((ch >= 65 && ch <=90) || (ch >= 97 && ch <= 122)){
            System.out.println("Entered char is a alphabet");
        } else {
            System.out.println("Entered character is not an alphabet.");
        }
        sc.close();
    }
}