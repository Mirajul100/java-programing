package Abstraction;

public class Circle extends Shape {
    double r;

    Circle(double r) {
        super(r, r);
    }

    void area() {
        double result;
        result = Math.PI * dim1 * dim2;
        System.out.printf("Circle area is : %.2f", result);
    }
}
