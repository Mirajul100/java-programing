public class Polymorphism {
    public static void main(String[] args) {
        // Shape shape = new Shape();
        // Shape shape1 = new Triangle(10, 20);
        // Shape shape3 = new Rectangle(30, 40);
        Shape shape[] = new Shape[3];
        shape[0] = new Shape();
        shape[1] = new Triangle(10, 20);
        shape[2] = new Rectangle(20, 30);
        for (int i = 0 ; i < shape.length; i++)
        {
            System.out.println(shape[i].area());
        }

    }
}
