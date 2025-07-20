import java.util.Scanner;
class P24{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter an integer value");
    int num=sc.nextInt();

    if(num>0)
    System.out.println("positive");
    else
    if(num<0)
    System.out.println("negetive");
    else
    System.out.println("neither positive nor negetive");
    sc.close();
}
}