/*
10  20  30
40  50  60
70  80  90

output :-right diagonal element(10 50 90)*/

import java.util.Scanner;
class AP1{
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
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j)
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}