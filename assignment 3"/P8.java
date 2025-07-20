import java.util.Scanner;
class P8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

         System.out.println("enter total number of classes held");
        int classes=sc.nextInt();

        System.out.println("enter number of classes you attend");
        int attended=sc.nextInt();

        int percentage=100*attended/classes;
        System.out.println("you attended "+percentage+"% classes");
        
        System.out.println("if you have madical enter Y otherwise enter N");
        char medical=sc.next().charAt(0);
        
        if(medical=='N'||medical=='Y'){
        if(percentage<75){
        if(medical=='N')
        System.out.println("you are not allowed to sit in exam");
        else
        System.out.println("you are allowed to sit in exam");
        }
        else
        System.out.println("you are allowed to sit in exam");
        }
       else
       System.out.println("this character is not allowed please answer in Y or N");
        sc.close();
    }
}