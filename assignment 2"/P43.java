import java.util.Scanner;
class P43{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter height of the cone");
        int height=sc.nextInt();
        System.out.println(" enter  slaint height of the cone");
        int sheight=sc.nextInt();
        int radius=(int)(Math.sqrt(sheight*sheight-height*height));
        float areaofbase=(float)(radius*radius*3.14);
        float cost=(float)(areaofbase*10);
        System.out.println("the cost of polishing the base of cone is: "+cost);
        sc.close();

    }
}