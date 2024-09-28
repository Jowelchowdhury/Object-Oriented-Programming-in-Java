//Create a class named “Book” with attributes title, author, and price. Use the this keyword in setter methods to assign values to these attributes. Additionally, implement a method named “displayDetails” that prints all the attributes of the book. In the main method, create a Book object, use the setter methods to assign values, and call the displayDetails method.
package book.java;

import java.awt.print.Book;


public class BookJava {
    String title;
    String author;
    int price;
    BookJava(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
        
    
        
    }
    void displayDetails(){
        System.out.println("The title is :"+this.title);
        System.out.println("The author is :"+this.author);
        System.out.println("the price is:"+this.price);
    }

    public static void main(String[] args) {
        BookJava b=new BookJava("Helmat", "William Shakespear", 100);
        b.displayDetails();
        BookJava b1= new BookJava("Game of Throns", "William", 200);
        b1.displayDetails();
        
        
        
    }

 
    
}
