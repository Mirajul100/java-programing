package Project12;

public class BoxVolume {
    double height,width,depth;
    BoxVolume(double height , double width , double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayvol(){
        double volume = height*width*depth;
        System.out.println("Volume of Box : "+volume);
    }
}
