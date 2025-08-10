import java.util.Scanner;
class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int temp=0;
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;}
            }
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}