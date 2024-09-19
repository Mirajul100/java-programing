package Abstraction;

public class Test {
    public static void main(String[] args) {
        Shape shape;
        double a = 20;
        double b = 30;
        shape = new Triangle(a, b);
        shape.area();
        shape = new Rectangle(a, b);
        shape.area();
        shape = new Circle(b);
        shape.area();
    }
}
