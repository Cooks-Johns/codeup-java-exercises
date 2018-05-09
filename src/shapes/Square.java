package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double width, double length, double area, double perimeter, double side) {
        super(width, length, area, perimeter);
        this.side = side;



   }

    public Square(int value) {
        super(4,5);


    }

    public double getPerimeter() {
       return side*4;
   }


    public double getArea() {
        return side * side;
    }
}
