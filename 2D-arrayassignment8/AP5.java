
/*
10  20  30
40  50  60
70  80  90

output :-sum of even element(450)
         sum of odd element(0) */

import java.util.Scanner;
class AP5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of row and coloumn");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("enter "+(i+1)+","+(j+1)+" element");
                arr[i][j]=sc.nextInt();
            }
        }
         int sum1=0,sum2=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]%2==0)
                sum1+=arr[i][j];
                else
                sum2+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("sum of even elements "+sum1);
        System.out.println("sum of odd elements "+sum2);

        sc.close();
    }
}
