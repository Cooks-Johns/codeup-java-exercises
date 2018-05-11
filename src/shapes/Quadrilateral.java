package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

//    and implements Measurable. This class should have:
//
//    protected properties for length and width
    protected double lenght;
    protected double width;

//    a constructor that accepts two numbers for the length and width and sets those properties
    public Quadrilateral(double lenght, double width) {
        this.width = width;
        this.lenght = lenght;
    }

    public abstract void setLength(double lenght);
    public abstract void setWidth(double width);

    public double getLenght() {
        return lenght;
    }

    public  double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return lenght * width;
    }


//    methods for getting the length and width
//    abstract methods for setting the length and width


}
