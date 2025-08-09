/*
ABCDE
 A__D
  A_C
   AB
    A

 */
class PT54 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            char trial='A';
            for(int j=1;j<=i;j++){
                if(i==5||j==1||j==i)
                System.out.print(trial);
                else
                System.out.print("_");
                trial++;
            }
            System.out.println();
        }
    }
}
