package shapes;



public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle();
        System.out.println("       Lets play with shapes        ");
        System.out.println("  <-------------------------------> ");
        System.out.println("     You will now turn into a " + box1.getPerimeter() + " you're lucky!");

        Square box2 = new Square(5);
        System.out.println(box2);
        System.out.println("FYI, you will be trapped in will only be  " + box2.getArea() + " and there will be no wifi!!");
        System.out.println("So the primeter of the box will be " + box2.getPerimeter() + " also looks like you have the biggest room!");

    }

}
