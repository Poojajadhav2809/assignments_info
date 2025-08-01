import java.util.Scanner;
class P27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2!=0)
            System.out.print('*'+" ");
            else
            System.out.print('#'+" ");
        i++;
            }
            sc.close();
    }
}