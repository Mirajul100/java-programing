package Mathode_Overriding;

public class Point extends Circle{
    private int h , w;

    public Point(int h , int w )
    {
        super(0);
        this.h = h;
        this.w = w;
    }

    public double Area()
    {
        return 0;
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        Point point = new Point(100, 50);

        point.h = 100;

        System.out.println("redious : " + c.Area());
        System.out.println(point.Area());
    }
}
