import java.util.Scanner;
class P57{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<=n2){
        int i=1,counter=0;

        while(i<=n1)
       {
        if(n1%i==0){
        counter=counter+1;
        }
        i++;
    }
       if(counter==2)
       System.out.println(n1);
       n1++;
}
sc.close();
}}