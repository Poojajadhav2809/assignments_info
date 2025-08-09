/*
*****
*  *
* *
**
*

 */
class PT35 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                if((j==5)||i==1||(j==i))
                System.out.print("*");
                else
                System.out.print(" ");
            }System.out.println();
        }
    }
    
}
