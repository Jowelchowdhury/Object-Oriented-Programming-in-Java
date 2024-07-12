//Design a Java program that takes a year as input and uses the ternary operator to determine 
whether the year is a leap year or not. Display an appropriate message accordingly? QUEStion?



package leapyear.java;

import java.time.Year;

public class LeapYearJava {

   
    public static void main(String[] args) {
        int year =2000;
        String result=(year%4==0)?
                ((year%100==0)?
                ((year%400==0)?"leap year":"Not a leap year")
                :"leap year")
                :"Not a leap year";
        System.out.println("Year is"+""+result);
                
                
                
       
    }
    
}