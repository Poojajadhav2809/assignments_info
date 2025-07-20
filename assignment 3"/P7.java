import java.util.Scanner;
class P7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter total number of classes held");
        int classes=sc.nextInt();

        System.out.println("enter number of classes you attend");
        int attended=sc.nextInt();

        int percentage=100*attended/classes;
        System.out.println("you attended "+percentage+"% classes");
        
        if(percentage<75)
        System.out.println("you are not allowed to sit in exam");
        else
        System.out.println("you are allowed to sit in exam");
        sc.close();

    }
}