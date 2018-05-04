package shapes;

public class Circle {

    private static int circleCoutn = 0;
    private double radius;

    public Circle(double radius) {
        this.radius =  radius;
        circleCoutn++;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return Math.PI * 2 * radius;

    }

    public static int getCircleCount() {
        return circleCoutn;
    }

}
