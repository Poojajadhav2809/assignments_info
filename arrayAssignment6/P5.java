import java.util.Scanner;
class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]%5==0)
            arr[i]=0;
        System.out.println(arr[i]);

           }
        sc.close();
    }
}