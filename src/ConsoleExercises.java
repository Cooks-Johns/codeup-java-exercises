import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//

        System.out.print("Enter a number: ");
        int usrInt = sc.nextInt();

//        Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?

        System.out.print("Please enter three verbs: \n" );
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();



        System.out.println("All the text entered: " + firstWord + " " + secondWord + " " + thirdWord);

        sc.nextLine();  // grabs the last \n charcter and we can ignore it


//        Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
//        do you capture all of the words?

        System.out.print("Please enter a funny phrase \n" );
        String thisSentence = sc.nextLine(); //have to use nextLine() for a sentence
        System.out.println("As the duck sits on the desk the developer looks at him and says <br> " + "' " + thisSentence + "' " +
                " they love to " + firstWord + " and "  + secondWord + "  , but the really love to do is " + thirdWord +
                " and if all else fails pour some water on it!");

//        Calculate the perimeter and area of Codeup's classrooms
//        Prompt the user to enter values of length and width of the classroom.
//        Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//          Assume that the rooms are perfect rectangles.
//          Assume that the user will enter valid numeric data for length and width.
//          Display the area and perimeter of that classroom.

        System.out.println();
        System.out.print(firstWord + " and tell me the length: ");
        String thisLongString = sc.next();
        double length = Double.parseDouble(thisLongString);
        System.out.println("the legnth is  " + length + " so you might want to  ");

        System.out.print(" and tell me the width: ");
        String fatString = sc.next();
        double width = Double.parseDouble(fatString);
        System.out.print("the width is  " + width + " so you might want to  ");


//              area = length x width
//              perimter = 2 x length + 2 x width

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of Rectangle:");
//        double length = sc.nextDouble();
//
//        System.out.println("Enter the width of Rectangle:");
//        double width = sc.nextDouble();
//
//        System.out.println("Enter the height of Rectangle:");
//        double height = sc.nextDouble();
//
//        double area = length*width;
//        double volume =length*width*height;
//        System.out.println("Area of Rectangle is: " + area + " the volume of the Rectangle is: " + volume);

        }
    }

