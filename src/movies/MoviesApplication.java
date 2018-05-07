package movies;
import util.Input;

public class MoviesApplication {

    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        System.out.println("Welcome to MovieFlex! ");

        showMenue();

        public static void showMenue() {
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("5 - view movies in the musical category");


        }



    }
}
//
//--------===============               EXAMPLE
//    What would you like to do?
//
//        0 - exit
//        1 - view all movies
//        2 - view movies in the animated category
//        3 - view movies in the drama category
//        4 - view movies in the horror category
//        5 - view movies in the scifi category
//
//        Enter your choice: 1
//
//        Frankenstein -- horror
//        Goodfellas -- drama
//        Pulp Fiction -- drama
//        ...