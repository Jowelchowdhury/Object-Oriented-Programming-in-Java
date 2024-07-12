//
package amrstong.number.java;
import java.util.Scanner;
public class AmrstongNumberJava {

   
    public static void main(String[] args) {
        int number, count=0, sum=0, a, b, c;
        System.out.println("Enter the number is number:");
        Scanner sc = new Scanner(System.in);
        number= sc.nextInt();
        a=number;
        c=number;
        while(a>0){
            a=a/10;
            count++;
        }
        while(number>0){
           b=number%10;
           sum=(int)(sum+Math.pow(b,count));
           number=number/10;
        }
        if(sum==c){
            System.out.println("Enter the number is Amrstong number:");
            
        }
        else{
            System.out.println("Enter the number is not an Amrstong number:");
        }
        
        
    }
    
}
