import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Show Me What You Got!  ");
        userInput =  sc.nextLine();



        System.out.println("Is that all You got? " + userInput + " ,HAHAHAHAHAHA");
        System.out.println("==================");
        sc.nextLine();


        int facvNum;
        System.out.println("givwe it to me");
        facvNum = sc.nextInt();

        System.out.println("your num" + facvNum);

    }
}
