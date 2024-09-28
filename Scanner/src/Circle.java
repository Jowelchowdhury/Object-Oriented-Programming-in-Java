//Create a Java program using scanner.
import java.util.Scanner;
public class Circle {

    
    public static void main(String[] args) {
        float pi=3.1416f, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the r of circle:");
        r = sc.nextFloat();
        float c = calculateArea( pi, r);
        System.out.println("Enter the area is:"+c);
        
        
        
        
       
    }
    public static float calculateArea(float a, float b){
        float area = a*b*b;
        return area;

    
    }
    
}
