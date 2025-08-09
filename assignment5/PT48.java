/*
    A
   AB
  A_C
 A__D
ABCDE

 */
class PT48 {
    public static void main(String args[]){
       for(int i=1;i<=5;i++){
        char trial='A';
        for(int s=5;s>i;s--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            if(j==1||i==j||i==5)
            System.out.print(trial);
            else
            System.out.print("_");
            trial++;
        }
        System.out.println();
       } 
    }
}
