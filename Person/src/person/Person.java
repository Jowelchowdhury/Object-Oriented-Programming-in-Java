//Create a class Person with private, protected, and public fields and methods. Show how these fields and methods can be accessed from within the class, from a subclass, and from a different class in the same package.
package person;

public class Person {
    private String name;
    public int age;
    protected String address;
    private void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    protected void setAddress(String address){
        this.address=address;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
    }
   
    public static void main(String []args){
        
        Person p=new Person();
        p.setAge(21);
        p.setName("jowel");
        p.display();
        
    }
    
    }
    

