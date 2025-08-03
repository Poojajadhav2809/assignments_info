
/*
1  2  3  4
3  1  2  6
8  9  0  1

output :-print the elements of that row whose sum is maximum */

import java.util.Scanner;
class AP6{
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
         int max=0,row=0;
        for(int i=0;i<r;i++){
            int sum1=0;
            for(int j=0;j<c;j++){
                sum1+=arr[i][j];
            }
            if(sum1>max){
            max=sum1;
            row=i;}
        }
        for(int i=row;i<=row;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    

        sc.close();
    }
}

