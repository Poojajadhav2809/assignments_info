/*
A
AB
A C
A  D
ABCDE

 */
class PT22 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            char alpha='A';
            for(int j=1;j<=i;j++){
                if((j==1)||j==i||i==5)
                System.out.print(" ");
                else
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
    }
}

    



