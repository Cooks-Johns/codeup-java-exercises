import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        int sides = askForNumberOfSides();
        do {
            rollDiceMessage();
            int dice1 = roll(sides);
            int dice2 = roll(sides);
            System.out.printf("Dice 1 is %d, Dice 2 is %d%n", dice1, dice2);
        } while (wantsToContinue());
    }
    public static int askForNumberOfSides() {

    }
    public static void rollDiceMessage() {


    }
    public static int roll(int sides) {

    }
    public static boolean wantsToContinue() {

    }
}