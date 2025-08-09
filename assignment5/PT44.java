/*
    1
   22
  333
 4444
55555

 */
class PT44{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            } 
            for(int j=1;j<=i;j++){
                System.out.print(i);
            } 
            System.out.println();
              }
    }
}