//Create a Java program that prompts the user to enter a direction abbreviation (N, S, E, 
W). Use a switch statement to convert the abbreviation to its corresponding full name 
(North, South, East, West) and display it.//Question?





package Switch;
import java.util.Scanner;
public class java {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("a direction abbreviation:");
        char ch = sc.next().charAt(0);
        switch(ch){
           
            case 'N':
                System.out.println("North");
                break;
            case 'S':
                System.out.println("South");
                break;
            case 'E':
                System.out.println("East");
                break;
            case 'W':
                System.out.println("West");
                break;
            default:
               
                    System.out.println("Element not found:");
                    

        }
        
    }
    
}
