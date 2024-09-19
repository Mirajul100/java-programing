package project9;

public class MainTest {
    public static void main(String[] args) {
        Car car = new Car("lambo", 2773, "harican");
        Car car1 = new Car("farrai",3774,"horajon");
        Car car2 = new Car("Mastang",4774,"jasko");
        System.out.println("\nThis is for car\n");
        System.out.println(car.name);
        System.out.println(car.id);
        System.out.println(car.vareant);
        System.out.println(car1.name);
        System.out.println(car1.id);
        System.out.println(car1.vareant);
        System.out.println(car2.name);
        System.out.println(car2.id);
        System.out.println(car2.vareant);
        Motor motor = new Motor("Hinda",34774,"v2");
        System.out.println("\nThis is for bicycle\n");
        System.out.println(motor.name);
        System.out.println(motor.id);
        System.out.println(motor.engine);
    }
}
