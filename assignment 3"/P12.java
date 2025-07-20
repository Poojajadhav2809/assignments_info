import java.util.Scanner;
class P12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a four digit number");
        int digit=sc.nextInt();

        if (digit >= 1000 && digit <= 9999) {
            
            int d1 = digit / 1000;          
            int d2 = (digit / 100) % 10;    
            int d3 = (digit / 10) % 10;     
            int d4 = digit % 10;            

            
            int reversed = d4 * 1000 + d3 * 100 + d2 * 10 + d1;

            System.out.println("Reversed number: " + reversed);
        } else {
            System.out.println("Invalid input! Please enter a 4-digit number.");
        }

        sc.close();
    }
}


    