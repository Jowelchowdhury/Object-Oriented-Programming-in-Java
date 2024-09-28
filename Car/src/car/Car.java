//Write a class named “Student” with attributes name and grade. Include a constructor that initializes these attributes and another constructor that takes a Student object as a parameter and uses the this keyword to copy the attributes. Implement a method named “displayInfo” to print the students details. In the main method, create a Student object, create a copy of this object using the copy constructor, and display the details of both students.
package car;


public class Car {
    String make;
    String model;
    
    int year;
    Car(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
        
    }
    public void showCarDetails(){
        System.out.println("Enter the Make:"+model);
        System.out.println("Enter the Model:"+model);
        System.out.println("Enter the Year:"+year);
    }

    
    public static void main(String[] args) {
        Car c=new Car("alice", "Marcedes", 1970);
        c.showCarDetails();
        Car c1=new Car("Benzamin", "BMW", 1970);
        c1.showCarDetails();
        
    }
    
}
