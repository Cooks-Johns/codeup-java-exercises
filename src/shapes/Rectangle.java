package shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
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


    public String toString() {
    return  "                       This Rectangle with length of " + getLength() + " and width of " + getWidth() + " has permimeter of "+ getPerimeter() + " and area of " +  getArea();
    }
}
