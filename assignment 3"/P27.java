import java.util.Scanner;
class P27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any letter");
        char letter=sc.next().charAt(0);

        switch(letter){
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':   
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("vowel");break;
        default : System.out.println("not a vowel");      }
            sc.close();
    }
}