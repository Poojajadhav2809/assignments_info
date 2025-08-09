/*
1
222
33333
4444444
555555555

 */
class PT29 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i+i-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
