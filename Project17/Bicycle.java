package Project17;

public class Bicycle extends Vehicle {
    int wheel;
    Bicycle(int wheel,String color,int price,String name){
        super(color, price , name); // construction overrating
        this.wheel = wheel;
    }
    void display()
    {
        super.display();
        System.out.println("wheel is : "+wheel);
    }
}
