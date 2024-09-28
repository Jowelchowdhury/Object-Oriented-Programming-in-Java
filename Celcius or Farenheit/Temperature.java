//Create a Java program that converts temperature from Celcius to Farenheit or vice versa based on user input, using the ternary operator for the conversion logic.
package temperature;
import java.util.Scanner;


public class Temperature {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        System.out.println("Enter the C for Celcius or F for Farenheit:");
        char input = sc.next().charAt(0);
        String result = (input=='C'||input=='c')?
                temperature+"Celcius is :"+(((9*temperature)/5)+32)+"Farenheit":
                (input=='F'||input=='f')?
                temperature+"Farenheit is:"+(((temperature-32)/9)*5)+"Celcius":
                "Invalid input";
        System.out.println(result);
        
        
    }
    
}
