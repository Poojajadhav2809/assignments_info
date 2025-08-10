import java.util.Scanner;
class P4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element you want to search");
        int n=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==n)
            System.out.println(arr[i]);
            }
        sc.close();
    }
}
