package project8;
import java.util.*;
public class MainTest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String carname;
    System.out.print("Enter your faborite car name : ");
    carname = input.nextLine();
    Car car = new Car(carname);
    String bicyclename;
    System.out.print("Enter your faborite bicycle name : ");
    bicyclename = input.nextLine();
    Bicycle bicycle = new Bicycle(bicyclename);
    car.go(car.name);
    bicycle.go(bicycle.name);
    car.stopped(car.name);
    bicycle.stopped(bicycle.name);
    System.out.println(car.name+" Car speed is "+car.car_speed+" Kilo meterper hour ");
    System.out.println(bicycle.name+" Bicycle speed is "+bicycle.bicycle_speed+" kilo meterper hour ");
    System.out.println(car.name + " have "+car.wheel+" wheel ");
    System.out.println(car.name+" have "+car.door+"door");
    System.out.println(bicycle.name+" have "+bicycle.wheel+" wheel ");
    System.out.println(bicycle.name+" have "+bicycle.padle+ " padles ");

    }
}
