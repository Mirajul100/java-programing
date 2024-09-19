package Abstraction;

public class Rectangle extends Shape {
    double result;

    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    void area() {
        result = dim1 * dim2;
        System.out.println("Rectangle area is : " + result);
    }
}
