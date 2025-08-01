import java.util.Scanner;
class P35{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int count=0;
        while(n!=0){
            count+=1;
            n=n/10;
        }
        System.out.println("number of digit: "+count);
        sc.close();
    }
    }