// WAP to find out the sum of all integer between 100 and 200 which are divisible by 9
class P59{
    public static void main(String args[]){
        int n1=100,n2=200,sum=0;
        while(n1<=n2){
            if(n1%9==0)
            sum+=n1;
            n1++;
        }
        System.out.println(sum);
    }
}