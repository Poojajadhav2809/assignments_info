import java.util.Scanner;
class P43{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter electricity unit");
        int unit=sc.nextInt();
        double amount=0;
        if(unit<=50)
        {amount=unit*0.50;
        System.out.println("your electricity bill is: "+amount);
    }else
    if(unit<=150)
    {amount=50*0.50+(unit-50)*0.75;
    }else
    if(unit<=250)
    {amount=100*0.75+50*0.50+(unit-150)*1.20;
    }else
    if(unit>250)
    {amount=100*1.20+100*0.75+50*0.50+(unit-250)*1.50;
    } 
    amount=amount+(amount*20/100);
    System.out.println("your electricity bill is: "+amount); 
    sc.close();
      }
}