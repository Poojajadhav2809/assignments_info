/*
EEEEE
DDDD
CCC
BB
A

 */

class PT34 {
    public static void main(String args[]){
        char trial='E';
        for(int i=1;i<=5;i++){
            
            for(int j=5;j>=i;j--){
                System.out.print(trial);
            }System.out.println();
            trial--;
        }
    }
    
}
