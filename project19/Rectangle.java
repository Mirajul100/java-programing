public class Rectangle extends Shape{
    double widts,length;
    Rectangle(double widts,double length){
        this.widts = widts;
        this.length = length;
    }
    double area(){
        System.out.print("Area of the Rectangle is : ");
        return widts * length;
    }
}
