//Write a Java program that checks whether a given number is prime or not using a loop. Prompt the user to enter a number and then determine and display whether it's prime or not.
package employee;

public class Employee {
    String name;
    int id;
    int salary;
    Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayEmployeeDetails(){
        System.out.println("Enter the Name:"+name);
        System.out.println("Enter the ID:"+id);
        System.out.println("Enter the Salary:"+salary);
        
    }

  
    public static void main(String[] args) {
        Employee em=new Employee("Jowel", 10, 3000);
        
        em.displayEmployeeDetails();
       
    }
    
}
