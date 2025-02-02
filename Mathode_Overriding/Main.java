package Mathode_Overriding;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        Point point = new Point(100, 50);

        System.out.println("redious : " + c.Area());
        System.out.println(point.Area());
    }
}
