package shapes;

public class Rectangle {
    protected double width;
    protected double length;
    protected double area;
    protected double perimeter;



    public Rectangle(double width, double length, double area, double perimeter) {
        this.width = width;
        this.length = length;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area = length * width;
    }

    public double getPerimeter() {
        return perimeter = 2 * length + 2 * width;
    }

    public double sides(){
        return getWidth() + getLength();
    }
    public String toString() {
    return  "a rec with" + getLength() + " and width of " + getArea() + getPerimeter() + sides();
    }
}
