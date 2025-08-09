/*
ABCDE
 ABCD
  ABC
   AB
    A

 */
class PT55 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            char trial='A';
            for(int j=1;j<=i;j++){
                System.out.print(trial);
                trial++;
            }
            System.out.println();
        }
    }
}
