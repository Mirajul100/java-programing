package Project17;

public class MainTest {
    public static void main(String[] args) {

        // hierarchical inheritance

        Car car = new Car("red", 10000, 4, "Lamborgine");
        car.display();
        car.go();
        car.stop();
        Bicycle bicycle = new Bicycle(2, "White", 2000, "phonix");
        bicycle.display();
        Cng cng = new Cng("Tata", 3, "Green", 2400);
        cng.display();
        cng.go();
        cng.stop();
    }
}
