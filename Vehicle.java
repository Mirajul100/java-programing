// Base class
public abstract class Vehicle {
    // Constructor
    public Vehicle() {
        System.out.println("Vehicle created.");
    }

    // Method to define moving behavior
    public abstract void move();

    // Method to define carrying behavior
    public void carry() {
        System.out.println("The vehicle is carrying cargo.");
    }
}

// Derived class: Car
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is driving on the road.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.carry();
    }
}

// Derived class: Boat
class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("The boat is sailing on the water.");
    }

    public static void main(String[] args) {
        Boat boat = new Boat();
        boat.move();
        boat.carry();
    }
}
