//Develop a class named “Ellipse” with major_axis and minor_axis attributes. Within this class, define a method called “calculateArea”that computes and returns the area of the ellipse. In the main section of your program, create an Ellipse object, set its major and minor axes, call the calculateArea method, and display the area.
package ellipse;


public class Ellipse {

   
    public static void main(String[] args) {
        float a=10f;
        float b= 20;
        float area=calculateArea(a, b);
        System.out.println(area);
       
    }
    public static float calculateArea(float a, float b){
        float pi =3.1416f;
        float kk=pi*a*b;
        return kk;
    }
    
}
