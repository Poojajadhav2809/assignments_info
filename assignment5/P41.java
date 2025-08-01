import java.util.Scanner;
class P41{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int i=n1,c=0;
        while(i<=n1*n2){
            if(i%n1==0&&i%n2==0){
            c=i;
            break;}
            i++;
        }
        System.out.println(c);
        sc.close();

    }
}