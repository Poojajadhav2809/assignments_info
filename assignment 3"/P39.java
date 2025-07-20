import java.util.Scanner;
class P39{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount in Rs.");
        int amount=sc.nextInt();

        int note500=0,note100=0,note50=0,note20=0,note10=0;
        if(amount>=500){
        note500=amount/500;
        amount=amount%2;}
        if(amount>=100){
            note100=amount/100;
            amount=amount%2;
        }
        if(amount>=50){
            note50=amount/50;
            amount=amount%2;
        }
        if(amount>=20){
            note20=amount/20;
            amount=amount%2;
        }
        if(amount>=10){
            note10=amount/10;
            amount=amount%2;
        }else
        System.out.println("your amount is less then 10. so it is not in NOTE form");
        System.out.println("no. of 500 note = "+note500);
        System.out.println("no. of 100 note = "+note100);
        System.out.println("no. of 50 note = "+note50);
        System.out.println("no. of 20 note = "+note20);
        System.out.println("no. of 10 note = "+note10);
        System.out.println("total no. of notes = "+(note500+note100+note50+note20+note10));
        sc.close();
    }
}