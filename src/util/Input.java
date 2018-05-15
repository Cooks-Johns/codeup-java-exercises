package util;
import java.util.Scanner;
import java.lang.NumberFormatException;


public class Input {


    private Scanner scanner;

        public Input() {

            scanner = new Scanner(System.in);
        }

        public String getString() {

            return scanner.nextLine();
        }



        public boolean yesNo() {
            String answer = scanner.nextLine();  // null
            // auto-boxing => value (string) -> wrap it in a an object -> new String("y").equalsIgnoreCase()
            return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
        }

        public int getInt(int min, int max) {
            int value = Integer.valueOf(String s);
            System.out.println(s +10);

            if (value < min || value > max) {
                System.out.printf("Enter a number between %d and %d%n", min, max);
                return getInt(min, max);
            }
            return value;
        }

       public int  getInt() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

        public double getDouble(double min, double max) {
            double value = getDouble();
            if (value < min || value > max) {
                System.out.printf("Enter a number between %f and %f%n", min, max);
                return getDouble(min, max);
            }
            return value;
        }

        public double getDouble() {
            double number = scanner.nextDouble();
            scanner.nextLine();
            return number;


        }
    }

