/*
    5
   44
  333
 2222
11111

 */
class PT45 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int s=1;s<i;s++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
               System.out.print(i); 
            }
            System.out.println();
        }
    }
}
