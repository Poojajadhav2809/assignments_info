/*
    *
   * *
  * * *
 * * * *
* * * * *

 */
class PT57 {
    public static void main(String args[]){
        int term = 1;
        for(int i=1;i<=5;i++){
            int s = 0;
            for(s=5;s>i;s--){
                System.out.print(" ");
            }
            for(int j = 1; j<=term ; j++){
                if(j % 2 != 0) 
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            term += 2;
            System.out.println();
        }
    }
}
