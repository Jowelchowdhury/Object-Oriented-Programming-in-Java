//Create classes Flyable and Swimmable with methods fly and swim respectively. Then, create a class Duck that inherits from both Flyable and Swimmable and implements both methods.
package duck;
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
public class Duck implements Flyable, Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck can fly!");
    }
    @Override
    public void swim(){
        System.out.println("Duck can swim!");
    }
    



    
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.swim();

       
    }
    
}
