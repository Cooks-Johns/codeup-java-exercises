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

        System.out.printf("Please enter three verbs \n" + " for your  intMage to spawn verbs, this was his \n" +
                "" + usrInt  +"th spell!");
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
                " the duck is just thinking about going to  " + firstWord + " , "  + secondWord + "  , or " + thirdWord +
                " then tells the developer 'if all else fails pour some water on it!'");

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
        System.out.println("the legnth is  " + length + " so you might want to  " + firstWord + " some more lol!");

        System.out.print(secondWord +" and tell me the width: ");
        String solidString = sc.next();
        double width = Double.parseDouble(solidString);
        System.out.print("the width is  " + width + " so you might want to  " + secondWord + " so you might not want to slow down!");

        System.out.print(thirdWord + "How high is this room we are in ");
        String olTallStringy = sc.next();
        double height = Double.parseDouble(olTallStringy);
        System.out.println("the height is  " + height + " so you might want to  " + thirdWord + " so you might not want to slow down!");

        double area = width * length;
        System.out.println(area);

        double perimeter = 2 * width + 2 * length;
        System.out.println(perimeter);

        double volume = width * length * height;
        System.out.println(volume);


        }
    }

