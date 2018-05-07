
import shapes.Circle;

import java.util.Arrays;

public class ServerNameGenerator {







    //=======----------------------notes





    public static void main(String[] args) {
        double[] numbers; // variable declaration
        numbers = new double[7]; // instantiation
        booleans[] booleans = new booleans[5];
        String [] strings = new String[10];
        Bob[] bobs = new Bob[10];



        // by enumeration
        String beatles[] = {" John ", " paul ", " hingo "," George"};
        String beatles[] = {" John ", " paul ", " hingo "," George"};

        boolean[] withValues = {true, false, true, false};
        Circle circles[] = {new Circle(4), new Circle(20), new Circle(4.5)};


        System.out.println(beatles[2]);
        System.out.println(Math.round(circles[1].getArea()));
        System.out.println();

        System.out.println(circles.length);
//
//        for (int i = 0; i < beatles.length; i++) {
//            System.out.println(beatles[i] + " , ");
//        }

//        for (int i = 0; i < circles.length; i++)
//            System.out.println(circles[i].getArea();
//        System.out.println(circles[i].getCircumference());
//
        // enhanced for loop
        for (String beatles : beatles) {
            System.out.println(beatles);
        }

        for (circle circle: circle) {
            System.out.println(circle.getArea());
        }



        numbers[0] = 6;  // in Java arrays do not have methods
        number[7] = 8;  error!




        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(bobs));
        System.out.println(Arrays.toString(beatles));





    }
}
