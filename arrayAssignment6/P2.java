import java.util.Scanner;
class P2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element");
            arr[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++){
                sum+=arr[i];
            }
            System.out.println("sum of the elements is "+sum);
            sc.close();
    }
    
}
