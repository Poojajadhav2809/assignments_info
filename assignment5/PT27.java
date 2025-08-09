/*
1
10
1 1
1  0
10101

 */
class PT27 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i%2!=0&&j%2!=0)||(j==1))
                System.out.print("1");
                else
                if((i%2==0&&i==j)||(i==5))
                System.out.print("0");
                else
                System.out.print(" ");
            }System.out.println();
        }
    }
}
