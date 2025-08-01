import java.util.Scanner;
class P32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int i=65;
        while(n!=0){
        if(i%2==0)
        System.out.print((char)(i+32)+" ");
        else
        System.out.print((char)i+" ");
        i++;
         n--;
        }
        sc.close();
    }
}