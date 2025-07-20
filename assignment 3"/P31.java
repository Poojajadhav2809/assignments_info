
import java.util.Scanner;

class P31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature");
        float temp = sc.nextFloat();
        System.out.println("Enter choice f for fahrengeit and c for celcius");
        char ch = sc.next().charAt(0);
        float toFahrenheit, toCelcius;
        switch(ch){
            case 'f':
                toFahrenheit = (temp * (9/5.0f)) + 32.0f;
                System.out.printf("The temrpature in fahrenheit is %.2f", toFahrenheit);
                break;
            
            case 'c':
                toCelcius = (temp-32)*(5/9.0f);
                System.out.printf("The temrpature in celcius is %.2f", toCelcius);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
