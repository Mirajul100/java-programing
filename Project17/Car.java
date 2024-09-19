package Project17;

public class Car extends Vehicle {
    int wheel;
    Car(String color , double price , int wheel,String name)
    {
        super(color, price,name); // construction overrating
        this.wheel = wheel;
    }
    
    void display()
    {
        super.display();
        System.out.println("Wheel are : "+wheel);
    }
}
