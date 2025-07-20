import java.util.Scanner;

class P26{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println(num + " is even.");
                break;
            case 1:
                System.out.println(num + " is odd.");
                break;
            case -1:
                System.out.println(num + " is odd.");
                break;
            default:
                System.out.println("Invalid input.");
                sc.close();
        }
    }
}