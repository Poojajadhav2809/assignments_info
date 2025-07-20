import java.util.Scanner;
class P11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your age: ");
        double age=sc.nextDouble();

        System.out.println("enter your gender, F or M");
        char gen=sc.next().charAt(0);

        System.out.println("enter your marital status, Y or N");
        char marital=sc.next().charAt(0);
        
        if(marital=='Y'||marital=='N'){
        if(age>=20&&age<=60){
        if(gen=='F'||gen=='M')
        if(gen=='F')
        System.out.println(" only work in Urban area");
        else
        if(age>=20&&age<=40)
        System.out.println("he may work in anywhere");
        else
        if(age>40&&age<=60)
        System.out.println("he will work in urban area only");
        }
        else
        System.out.println("ERROR");
        
    }
    sc.close();
}
}
