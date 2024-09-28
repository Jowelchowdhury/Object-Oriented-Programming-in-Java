//Create a Java program that prompts the user to enter a numerical grade. Using an if-else 
ladder, determine and output the corresponding letter grade based on the following 
grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: Below 60?//Question.



package grading.systement.java;

import java.util.Scanner;

public class GradingSystementJava {

   
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("The numerical Garde(0-100):");
       int grade=sc.nextInt();
       if(grade>=90){
           System.out.println("Letter Grade:A");
       }
       else if(grade>=80){
           System.out.println("Letter Grade:B");
           
          
       }
       else if(grade>=70){
           System.out.println("Letter Grade:C");
       }
       else if(grade>=60){
           System.out.println("Letter Grade:D");
           
       }
       else{
           System.out.println("Letter Grade:F");
       }
    }
    
}
 