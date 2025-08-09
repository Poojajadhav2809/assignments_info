/*
    A
   A B
  A B C
 A B C D
A B C D E  

 */
class PT59 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            char trial='A';
            for(int j=1;j<=i;j++){
                if(j==1)
                System.out.print(trial);
                else
                System.out.print(" "+trial);
                trial++;
            }
            System.out.println();
        }
    }
    
}
