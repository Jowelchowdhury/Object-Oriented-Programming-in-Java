//Create a java program to insert input.
package insert;

import java.util.Scanner;
public class Insert {

   
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Enter the result:"+sum);
        
    }
    
}
