package shapes;

public class Rectangle {
    protected double width;
    protected double length;
    protected double area;
    protected String type;



    public Rectangle(double v, double width, double length, double area) {
        this.width = width;
        this.length = length;
        this.area = area;
        type = "rectangle";
    }

    public Rectangle(int width, int length) {
        super();
    }

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return  2 * length + 2 * width;
    }

    public double sides(){
        return getWidth() + getLength();
    }
    public String toString() {
    return  "This Rectangle with is " + getLength() + " and width of " + getArea() + getPerimeter() + sides();
    }
}
