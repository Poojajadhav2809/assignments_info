/*
A
BCD
EFGHI
JKLMNOP

 */

class PT41{
    public static void main(String args[]){
    int k=0;
    char trial='A';
    for(int i=1;i<=4;i++){
    for(int j=1;j<=i+k;j++){
            System.out.print(trial);
            trial++;
        }
        k++;
        System.out.println();
}
}
}