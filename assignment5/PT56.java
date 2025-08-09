/*
11111
 2222
  333
   44
    5

 */
class PT56 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int s=1;s<i;s++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
