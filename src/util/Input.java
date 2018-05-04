package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;  // = null

    // 2 options
    public Input() {
        scanner = new Scanner(System.in);
    }


    public String getString() {
        return null;  // do this so it can be compiled
    }


   public boolean yesNo() {
        String answer = scanner.nextLine();

        // auto boxing => calue (string -> wrap
        // it in a an object -> new String("y').equalsIgnoreCase();

        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }

   public int getInt(int min, int max) {
        int value = getInt();
        if(value < min || value > max) {
            System.out.printf("Enter a number between %d  and %d%n", min, max);
            return getInt(min, max);
        }
        return value;
    }

    int getInt() {return scanner.nextInt();
    }

   public double getDouble(double min, double max) {
        double value = getDouble();
        if(value < min || value > max) {
            System.out.printf("Enter a number between %d  and %d%n", min, max);
            return getDouble(min, max);
        }
        return value;
    }
   public double getDouble(){
        return scanner.nextDouble();

    }

}
