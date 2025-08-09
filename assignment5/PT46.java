/*
    A
   AB
  ABC
 ABCD
ABCDE

 */
class PT46 {
    public static void main(String args[]){
       
        for(int i=1;i<=5;i++){
             char trial='A';
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(trial);
                trial++;
            }
            System.out.println();
        }
    }
}
