package project6;

public class MainTest {
    public static void main (String [] args)
    {
        Garage garage = new Garage();
        Car car1 = new Car("Lambo");
        Car car2 = new Car("Bmw");
        Car car3 = new Car("Royel roes");
        Bycikel bycikel1 = new Bycikel("phonix");
        Bycikel bycikel2 = new Bycikel("boost");
        Bycikel bycikel3 = new Bycikel("Waltoon");
        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
        garage.park(bycikel1);
        garage.park(bycikel2);
        garage.park(bycikel3);
    }
}
