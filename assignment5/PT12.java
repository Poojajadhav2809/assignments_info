/*
a
ab
abc
abcd
abcde
 */

class PT12 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            char a='a';
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
