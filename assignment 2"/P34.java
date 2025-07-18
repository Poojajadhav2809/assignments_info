import java.util.Scanner;
class P34{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first base of the trapazoid wooden area ");
        int base1=sc.nextInt();
        System.out.println("enter second base of the trapazoid wooden area ");
        int base2=sc.nextInt();
        System.out.println("enter height of the trapazoid wooden area ");
        int height=sc.nextInt();
        System.out.println("enter width of the walkway");
        int walkwidth=sc.nextInt();
        float areaoftr=(float)((0.5)*(base1+base2)*height);
         System.out.println(areaoftr);
         int areaofwl=(walkwidth*height);
         float remarea=(float)(areaoftr-areaofwl);
         System.out.println("wodden area after making walkaway: "+remarea);
         sc.close();
}
}