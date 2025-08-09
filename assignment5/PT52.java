/*
12345
 1__4
  1_3
   12
    1

 */
class PT52 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==5||j==1||j==i)
                System.out.print(j);
                else
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
