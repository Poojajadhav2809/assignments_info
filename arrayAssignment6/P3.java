import java.util.Scanner;
class P3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum1=0,sum2=0;
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element");
            arr[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++){
                if(arr[i]%2==0)
                sum1+=arr[i];
                else
                sum2+=arr[i];
            }
            System.out.println("some of even elements: "+sum1);
            System.out.println("some of odd elements: "+sum2);
            sc.close();
        }
    }