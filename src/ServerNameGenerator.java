
import java.util.Scanner;


public class ServerNameGenerator {


    public static void main(String[] args) {



        String[] adjectives = new String[10];
                 adjectives[0] = " brave ";
                 adjectives[1] = " chilling ";
                 adjectives[2] = " eager ";
                 adjectives[3] = " gentle ";
                 adjectives[4] = " Savage ";
                 adjectives[5] = " Beautiful ";
                 adjectives[6] = " Dope ";
                 adjectives[7] = " Strong ";
                 adjectives[8] = " powerful ";
                 adjectives[9] = " bright ";

        String[] nouns = new String[10];
                 nouns[0] = " Bull ";
                 nouns[1] = " warHead ";
                 nouns[2] = " Hive ";
                 nouns[3] = " Lion ";
                 nouns[4] = " King ";
                 nouns[5] = " WarLock ";
                 nouns[6] = " Cat ";
                 nouns[7] = " Bird ";
                 nouns[8] = " Cash ";
                 nouns[9] = " Book ";




        String userInput;
        Scanner sc;
        sc = new Scanner(System.in).useDelimiter("\n");




        System.out.println("What is your name? ");
        userInput = sc.next();

    int adj = adjectives.length;
    int noun = nouns.length;

    for (int i = 0;i < 10; i++) {
        double randomAdj = Math.floor(Math.random() * 10);
        int randAdj = (int) randomAdj;
        double randomNoun = Math.floor(Math.random() * 10);
        int randNoun = (int) randomNoun;



        System.out.println("Hello  " + userInput +
                ", your server name options are: " +
                adjectives[randAdj] + "-"+ nouns[randNoun]);
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
