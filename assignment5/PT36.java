/*
ABCDE
A  D
A C
AB
A

 */
class PT36 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            char trial='A';
            for(int j=5;j>=i;j--){
                if(i==1||j==5||j==i)
                System.out.print(trial);
                else
                System.out.print(" ");
                trial++;
                }
                System.out.println();
        }
    }
    
}
