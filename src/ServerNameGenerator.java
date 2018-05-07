import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ServerNameGenerator {


    public static void main(String[] args) {



        String[] adjectives = new String[] {
                " brave ", " chilling ", " eager ", " gentle ",
                " Savage ", " Beautiful ", " dope ", " strong ",
                " powerful "," bright "};

        String[] nouns = new String[]{
                " dog ", " car ", " goat ", " lapTop ", " hand ",
                " beef ", " fireBall ", " sun ", " mouse "," moose "};



        String userInput;
        Scanner sc;
        sc = new Scanner(System.in).useDelimiter("\n");




        System.out.println("What is your name? ");
        userInput = sc.next();

    int adj = adjectives.length;
    int noun = nouns.length;
    for (int i = 0;i < noun; i++) {
        int randAdj = (int) (Math.random() * adj);
        int randNoun = (int) (Math.random() * noun);



        System.out.println("Hello  " + userInput +
                ", your server name options are: " +
                adjectives[randAdj] + nouns[randNoun]);
    }


    }


}

















//
//    //=======----------------------notes
//import shapes.Circle;
//
//import java.util.Arrays;
//
//public class ServerNameGenerator {
//
//
//
//
//
//
//
//
//
//
//
//
//    public static void main(String[] args) {
//        double[] numbers; // variable declaration
//        numbers = new double[7]; // instantiation
//        booleans[] booleans = new booleans[5];
//        String [] strings = new String[10];
//
//
//
//        // by enumeration
//        String beatles[] = {" John ", " paul ", " hingo "," George"};
//        String beatles[] = {" John ", " paul ", " hingo "," George"};
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        boolean[] withValues = {true, false, true, false};
//        Circle circles[] = {new Circle(4), new Circle(20), new Circle(4.5)};
//
//
//        System.out.println(beatles[2]);
//        System.out.println(Math.round(circles[1].getArea()));
//        System.out.println();
////
////        System.out.println(circles.length);
//////
//////        for (int i = 0; i < beatles.length; i++) {
//////            System.out.println(beatles[i] + " , ");
//////        }
////
//////        for (int i = 0; i < circles.length; i++)
//////            System.out.println(circles[i].getArea();
//////        System.out.println(circles[i].getCircumference());
//////
////        // enhanced for loop
////        for (String beatles : beatles) {
////            System.out.println(beatles);
////        }
////
////        for (circle circle: circle) {
////            System.out.println(circle.getArea());
////        }
////
////
////
////        numbers[0] = 6;  // in Java arrays do not have methods
////        number[7] = 8;  error!
////
////
////
////
////        System.out.println(Arrays.toString(numbers));
////        System.out.println(Arrays.toString(booleans));
////        System.out.println(Arrays.toString(strings));
////        System.out.println(Arrays.toString(bobs));
////        System.out.println(Arrays.toString(beatles));
////
////
////
////
////
//    }
//}
