////package shapes;
////
////public class Rectangle {
////    protected int width;
////    protected int length;
////
////    public Rectangle(int width, int length) {
////        this.width = width;
////        this.length = length;
////    }
////
////
////    public double getWidth() {
////        return width;
////    }
////
////    public double getLength() {
////        return length;
////    }
////
////    public double getArea() {
////        return length * width;
////    }
////
////    public double getPerimeter() {
////        return  2 * length + 2 * width;
////    }
////
////
////    public String toString() {
////    return  "     This Rectangle length is " +
////            getLength() + " and width of " + getWidth() +
////            " the perimeter is "+ getPerimeter() + " and area of " +  getArea();
////    }
////}
////
//package shapes;
//
//public class Rectangle extends Quadrilateral {
//
//
//    protected double width;
//    protected double length;
//
//
//    public Rectangle(double length, double width) {
//        super(length, width);
//        this.width = width;
//        this.length = length;
//    }
//
//
//    @Override
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//
//    @Override
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//
//}