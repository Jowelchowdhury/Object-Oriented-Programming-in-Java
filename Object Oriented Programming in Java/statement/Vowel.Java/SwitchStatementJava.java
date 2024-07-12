//Write a Java program that takes a character as input and determines whether it's a vowel 
or a consonant using a switch statement. Display an appropriate message based on the 
classification?//QUESTION.


package pkgswitch.statement.java;

import java.util.Scanner;

public class SwitchStatementJava {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch=sc.next().charAt(0);
      
        switch(ch){
             case'a':
                  case'e':
                           case'i':
                                    case'o':
                                             case'u':
                                                      case'A':
                                                               case'E':
                                                                        case'I':
                                                                            case'O':
                                                                                case'U':
                                                                                    System.out.println(ch+"is a Vowel:");
                                                                                    break;
                                                                                default:
                                                                                    if(Character.isLetter(ch)){

                                                                                        System.out.println(ch+"Is a Consonant:");
                                                                                    }
                                                                                    else{
                                                                                        System.out.println(ch+"is not Alphabet:")
                                                                                    }
                                                                                
                                                                       
                                                              
        
       
        
    
     
       
        
    }
    
}
