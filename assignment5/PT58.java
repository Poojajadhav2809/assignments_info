/* 
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/
class PT58 {
    public static void main(String args[]){
        /*int term=1;
        for(int i=1;i<=5;i++){
            int term2=1;
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=term;j++){
                if(j%2!=0){
                    System.out.print(term2);
                    term2++;
                }
                else
                System.out.print(" ");

            }
            term+=2;
            System.out.println();

        }*/
        for(int i = 0; i <=5; i++){
            for(int j = 1; j <=5-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" "+j);
            }

            System.out.println();
        }
    }
    
}
