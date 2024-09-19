package Project17;

public class Cng extends Vehicle {
    int wheel;
    Cng(String name,int wheel,String color ,int price){
        super(color,price,name); // construction overrating
        this.wheel = wheel;
    }
    void display()
    {
        super.display();
        System.out.println("Cng Wheel is : "+wheel);
    }
}
