
//                ///---------======================================= 1

//        Basic Arithmetic
//
//        Create four methods Each will perform an
// arithmetic operation:  Addition, Subtraction,
// Multiplication,  Division
//
//        int userInt;
//        long factorialResult;

//        Each function needs to take two
//          parameters/arguments so that the operation can be performed.
//          Test your functions and verify the output.
//        Add a modulus function that finds the modulus of two numbers.
//                Food for thought: What happens if we try to divide by zero? What should happen?
//
//
//
// =--------------------========        Bonus
//
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.



        ///---------======================================= 2
//
//        Create a method that validates that user input is in a certain range
//
//        The method signature should look like this:
//
//
//        public static int getInteger(int min, int max);
//        and is used like this:
//
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        If the input is invalid, prompt the user again.
//
//                Hint: recursion might be helpful here!


        ///---------======================================= 3
//
//        Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
//
//
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24
//        Bonus
//
//        Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//                Use Recursion to implement the factorial.


        ///---------======================================= 4

//                Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//                Use the .random method of the java.lang.Math class to generate random numbers.

        ///---------======================================= 5



//        Game Development 101
//
//        Welcome to the world of game development!
//
//                You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//        The specs for the game are:
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//
//        Use the random method of the java.lang.Math class to generate a random number.
//        Bonus
//
//        Keep track of how many guesses a user makes
//        Set an upper limit on the number of guesses



    ///-----------------=================               TESTING

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println("Let's write and use methods!");


        System.out.println("2 plus 3 is " + add(3, 3));
        System.out.println("2 minus 3 is " + subtract(3, 3));
        System.out.println("2 times 3 is " + multiplication(3, 3));
        System.out.println("2 divided by 3 is " + divide(3, 3));




        int number = getInt(1, 10);
        showFactorialOutput(number);
    }



    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static int modulo(int number, int divisor) {
        return number % divisor;
    }
    public static int getInt() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        return scan.nextInt();
    }


    public static int getInt(int min, int max) {
        System.out.println("Please input an interger between " + min + max + ": ");
        int number = getInt();

        if (number < min || number > max) {
            return getInt(min, max);
        }
        return number;
    }

    public static long factorial(int number) {
        long total = 1;
        for (int i = number; i >= 1; i--) {
            total *= i;
        }
        return total;
    }


    public static void showFactorialOutput(int number) {
        String output = number + " ! = ";

        for (int i = 1; i <= number; i++) {
            output += i + " x ";
        }
        if (output.endsWith("x ")) {
            output = output.substring(0, output.length() - 2);
        }
        output += " = " + factorial(number);
        System.out.println(output);

    }
}


