//Define a class named “Circle” with an attribute radius. Include a constructor that initializes the radius using the this keyword. Also, implement a method named “calculateCircumference” that returns the circumference of the circle. In the main method, create a Circle object, set its radius, call the calculateCircumference method, and print the result.
package circle;

public class Circle {
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    void calculateCircumference(){
        double c = 2*Math.PI*this.radius;
        System.out.println("CirCumference is:"+c);
    }

    
    public static void main(String[] args) {
        Circle cr = new Circle(2.5);
        cr.calculateCircumference();
        
    }
    
}
