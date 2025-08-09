/*
5
54
543
5432
54321

 */
class PT25 {
      public static void main(String args[]){
        
        for(int i=1;i<=5;i++){
            int help=5;
            for(int j=1;j<=i;j++){
                System.out.print(help);
               help--;
            }
            System.out.println();

        }
    }
}