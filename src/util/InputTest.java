package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input(); // instantiate an object / create an object
//
//        System.out.println("Enter a message");
//        System.out.println(input.getString());
//
//        System.out.println("Do you want to continue (y/n)");
//        System.out.println(input.yesNo());
//
//        System.out.println("Enter a number between 6 and 18");
//        input.getInt(6, 18);
//
//        System.out.println("Enter any number");
//        System.out.println(input.getInt());
//
//        int intNum = input.getInt();
//        System.out.println(intNum);
//
//        double doubleInRange = input.getDouble(2.5, 7.9);
//        System.out.println("Enter a number between 2.5 and 7.9");
//        System.out.println(doubleInRange);
//
//        System.out.println("Enter any number");
//        System.out.println(input.getDouble());

        int number = input.getInt();

        System.out.println(number);

    }
}
