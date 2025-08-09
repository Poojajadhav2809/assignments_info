/*
ABCDE
ABCD
ABC
AB
A

 */
class PT33 {
    public static void main(String args[]){
       
        for(int i=1;i<=5;i++){
             char trial='A';
            for(int j=5;j>=i;j--){
                System.out.print(trial);
                trial++;
            }System.out.println();
        }
    }
    
}
