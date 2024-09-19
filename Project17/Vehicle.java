package Project17;

public class Vehicle {
    String color , name;
    double price;
    Vehicle(String color,double price,String name)
    {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    void display(){
        System.out.println();
        System.out.println("Name is : "+name);
        System.out.println("Color is : "+color);
        System.out.println("Price is : "+price);
    }

    void go()
    {
        System.out.println(name+" is going");
    }
    void stop()
    {
        System.out.println(name+" is stoped");
    }
}
