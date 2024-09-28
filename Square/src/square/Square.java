//Define a class named “Square” with a side_length attribute. Implement a method named “calculateArea” within this class that calculates and returns the area of the square. In your program main section, create a Square object, specify its side length, call the calculateArea method, and output the area.
package square;


public class Square {

    
    public static void main(String[] args) {
        float a=10f;
        float area=calculateArea(a);
        System.out.println(area);
        
    }
    public static float calculateArea(float a){
        float cc=a*a;
        return cc;
        
    }
    
}
