import java.util.Scanner;
class P4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter your marks");
        double marks=sc.nextDouble();

        if(marks>80)
        System.out.println("your grade is A");
        else
        if(marks>=60&&marks<=80)
        System.out.println("your grade is B");
        else
        if(marks>=50&&marks<60)
        System.out.println("your grade is C");
        else
        if(marks>=45&&marks<50)
        System.out.println("your grade is D");
        else
        if(marks>=25&&marks<45)
        System.out.println("your grade is E");
        else
        System.out.println("your grade is F");
        sc.close();

    }
}