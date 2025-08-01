import java.util.Scanner;
class P40{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0,count1=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0)
            count+=1;
            else
                count1+=1;
                n=n/10;
            
        }
        System.out.print("number of even digit: "+count+"\nnumber of odd digit: "+count1);
        sc.close();
    }
}