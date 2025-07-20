import java.util.Scanner;
class P44{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no.");
        float num1=sc.nextFloat();
        System.out.println("enter second no.");
        float num2=sc.nextFloat();
        sc.nextLine();
        System.out.println("enter your choice from + , > and ==");
        String choice=sc.nextLine();
        if(choice.equals("+")||choice.equals(">")||choice.equals("==")){
        if(choice.equals("+"))
            System.out.println("sum is: "+(num1+num2));
            else
            if(choice.equals(">")){
            if(num1>num2)
            System.out.println("greater number is: "+num1);
            else
            System.out.println("greater number is: "+num2);
            }
            else
            if(choice.equals("==")){
                if(num1==num2)
                System.out.println("both numbers are equal");
                else
                System.out.println("both numbers are not equal");
          }}else
            System.out.println("Invalid choice please chose + or > or ==");
            sc.close();
        }
        

    }
