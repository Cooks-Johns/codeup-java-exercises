import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //-------=============          A


        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
//-------=============          B
//        int doWhile = 0;
//        do{
//            System.out.println(doWhile);
//            doWhile +=2 ;
//        } while (doWhile <= 100);


////-------=============           5's from 100 to -10.
//        int downHill = 100;
//        do{
//            System.out.println(downHill);
//            downHill = downHill - 5;
//        } while (downHill >= -10);

        //-------=============       2, and displays the number squared on each line while the number is less than 1,000,000.


//        int j = 2;
//        do {
//            System.out.println(j);
//            j *= j;
//        } while (j <= 1000000);
//
//        for(int j = 5; j <= 15; j++) {
//            System.out.println(j);
//        }
//
//        for(long j = 2; j <= 1000000; j*= j) {
//            System.out.println(j);
//        }

            //-------=============  FIZZBUZZ

//        for (int a = 1; a <= 100; a++) {
//            boolean fizzBuzz = false;
//            if (a % 3 == 0) {
//                System.out.println("Fizz" + a);
//                fizzBuzz = true;
//            } if ( a % 5 == 0) {
//                System.out.println("You're a Buzz Kill Fizz");
//                fizzBuzz = true;
//            } if ( a % 3 == 0) {
//                System.out.println(a);
//                fizzBuzz = true;
//            } else {
//                System.out.println(String.valueOf(a));
//            }
//        }
////
//        for (int a = 1; a <=45; a++) {
//            if (a % 15 == 0) {
//                System.out.println("<LOL> Fizz Buzzin </LOL>");
//            } else if (a % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (a % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(a));
//            }
//        }
//-----=====================            DISPLAY A TABLE OF POWERS
        //  prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered
        // Ask if the user wants to continue
        // Assume that the user will enter valid data
        // Only continue if the user agrees to.
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        boolean userContinues = true;

        do {
                System.out.print("What number would you like to go up to? ");
                int userInt = sc.nextInt();
                System.out.println();
                System.out.println("Here is your table!");
                System.out.println();
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");
                for (int r = 1; r <= userInt; r += 1) {
                    System.out.format("%-7d", r);
                    System.out.print("|");
                    System.out.format(" %-8d", r * r);
                    System.out.print("|");
                    System.out.format(" %-9d", r * r * r);
                    System.out.println();
                }
                System.out.print("Would you like to enter another number (y/n)? ");
                String userResponse = sc.next();
                if (!userResponse.equalsIgnoreCase("y")) {
                    userContinues = false;
                }
            } while (userContinues);


        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter your class grade: ");
            int grade = sc.nextInt();

            if (grade >= 99 & grade <= 100) {
                System.out.println("Your grade is a A+");
            } else if (grade >= 88) {
                System.out.println("Your grade is a A");
            } else if (grade >= 80 & grade <= 87) {
                System.out.println("You received a B");
            } else if (grade >= 67 & grade <= 79) {
                System.out.println("You received a C");
            } else if (grade >= 60 & grade <= 66) {
                System.out.println("You received an D");
            } else if (grade >= 0 & grade <= 59) {
                System.out.println("You received an F");
            }

            System.out.print("Enter another grade? (y/n): ");
            System.out.println();
            choice = sc.next();

        }




    }




        //
        //refactor the previous two exercises to use a for loop instead




}
