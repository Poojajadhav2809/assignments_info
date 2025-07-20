import java.util.Scanner;
class P41{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your physics marks");
        System.out.println("enter your chemistry marks");
        System.out.println("enter your biology marks");
        System.out.println("enter your mathematics marks");
        System.out.println("enter your computer marks");
        float physics=sc.nextFloat();
        float chemistry=sc.nextFloat();
        float biology=sc.nextFloat();
        float maths=sc.nextFloat();
        float computer=sc.nextFloat();
        float sum=physics+chemistry+biology+maths+computer;
        if(physics>100||chemistry>100||biology>100||maths>100||computer>100)
        System.out.println("invalid marks please enter out of 100");
        else{
            float percentage=(sum/500)*100;
            if(percentage>=90)
            System.out.println("Grade A");
            else
            if(percentage>=80)
            System.out.println("Grade B");
            else
            if(percentage>=70)
            System.out.println("Grade C");
            else
            if(percentage>=60)
            System.out.println("Grade D");
            else
            if(percentage>=40)
            System.out.println("Grade E");
            else
            System.out.println("Grade F");

        }        
          sc.close();



    }
}