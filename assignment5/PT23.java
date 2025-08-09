/*
a
bc
d f
g  j
klmno

 */
class PT23 {
     public static void main(String args[]){
        char alpha='a';
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=i;j++){
                
                 if((j==1)||j==i||i==5)
                System.out.print(alpha);
                else
                System.out.print(" ");
                alpha++;
                }
            System.out.println();
        }
    }
}
