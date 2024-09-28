//Q. -Create a class Person with private, protected, and public fields and methods. Show how these fields and methods can be accessed from within the class, from a subclass, and from a different class in the same package.
public class Person
{
    privet String name;
    protected int age;
    public String address;
    public person(String name, int age, String address)
    {
        This.name=name;
        This.age=age;
        This.address=address;

    }
    public String getName()
    {
        return this.name;
    }
    protected int getAge()
    {
        return this.age;
    }
    privet void printAddress()
    {
        System.out.println("Enter the Address:"+ this.address);
    }
    public void display info()
    {
        System.out.println("Enter the Nmae:"+ this.name);
        System.out.println("Enter the Age:"+ this.age)
        printAddress();
    }
    
}