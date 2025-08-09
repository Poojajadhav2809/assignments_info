/*
    X 
   X X 
  X___X
 X_____X
X X X X X

 */
class PT60 {
    public static void main(String args[]){
        int term=1;
        for(int i=1;i<=5;i++){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=term;j++){
                if(j==1||j==term||j%2!=0&&i==5)
                System.out.print("X");
                else
                if(i==2&&j==2||j%2==0&&i==5)
                System.out.print(" ");
                else
                System.out.print("_");
            }
            term+=2;
            System.out.println();
        }
    }
}
