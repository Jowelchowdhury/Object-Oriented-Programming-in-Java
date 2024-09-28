//2-	Create classes ‘Flyable’ and ‘Swimmable’ with methods ‘fly’ and ‘swim’ respectively. Then, create a class ‘Duck’ that inherits from both ‘Flyable’ and ‘Swimmable’ and implements both methods in Java?

public class interface Flyable
{
    void fly();

}
public class interface Swimmable
{
    void swim();
}
public class Duck implements Flyable, Swimmable
{
    public void fly()
    {
        System.out.println("Enter the Duck is flying!");
    }
    public void swim()
    {
        System.out.println("Enter the Duck is Swimming!");
    }
    
}
public class main()
{
    public static void main (String []args)
    {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}