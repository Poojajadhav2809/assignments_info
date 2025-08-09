/*
    1
   11
  1*1
 1**1
11111

 */
class PT47 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            for( int j=1;j<=i;j++){
                if(i==5||j==1||j==i)
                System.out.print("1");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
