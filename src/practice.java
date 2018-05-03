//
//import java.util.Scanner;
//
//public class MethodsExercises {
//    public static void main(String[] args) {
//
//        int number1 = getInteger(1, 10);
//        int number2 = getInteger(10, 33);
//
//        double sum = add(number1, number2);
//        double difference = subtract(number1, number2);
//        double product = multiplication(number1, number2);
//        double quotient = divide(number1, number2);
//
//        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
//        System.out.println("The difference of " + number1 + " and " + number2 + " is: " + difference);
//        System.out.println("The sum product of " + number1 + " and " + number2 + " is: " + product);
//        System.out.println("The quotient of " + number1 + " and " + number2 + " is: " + quotient);
//
//        System.out.println("Now we're going to calculate factorials!");
//        int userInt;
//        long factorialResult;
//
//        do {
//            userInt = getInteger(1, 10);
//            factorialResult = factorial(userInt);
//            System.out.println("The factorial for " + userInt + "! is " + factorialResult);
//        } while(wantsToContinue());
//
//        System.out.println("Thanks for playing \"Factorial!\"");
//
//        System.out.println();
////        System.out.println("Now let's play \"Roll The Dice!\"");
////        diceRoller();
//    }
//
//    public static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static double subtract(double a, double b) {
//        return a - b;
//    }
//
//    public static double multiplication(double a, double b) {
//        return a * b;
//    }
//
//    public static double divide(double a, double b) {
//        return a / b;
//    }
//
//    public static double modulo(double a, double b) {
//        return a % b;
//    }
//
//    public static int getInteger(int min, int max) {
//        System.out.println("Please input an integer between " + min + " and " + max + ":");
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        if(number < min || number > max) {
//            return getInteger(min, max);
//        } else {
//            return number;
//        }
//    }
//
//    public static boolean wantsToContinue() {
//        System.out.println();
//        Scanner scan = new Scanner(System.in);
//        String userSelection;
//        boolean wantsToContinue;
//
//        System.out.println("Would you like to continue? Type \"y\" or yes to continue.");
//        userSelection = scan.next();
//        wantsToContinue = userSelection.equalsIgnoreCase("y") || userSelection.equalsIgnoreCase("yes");
//
//        return wantsToContinue;
//    }
//
//    public static long factorial(int num) {
//        // set the output at
//        long output = num;
//
//        // start w/ 1, then multiply by each number up to but not including the num.
//        for(int i = 1; i <= 5; i++) {
//            output *= i;
//        }
//
//        return output;
//    }
//
//
////    public static void diceRoller() {
////        diceSplash();
////
////        System.out.println("How many sides should each die have?");
////        int sides = getInteger(1, 100);
////        int die1;
////        int die2;
////        int result;
////
////        die1 = roll(sides);
////        System.out.println("The first die rolled a " + die1);
////
////        die2 = roll(sides);
////        System.out.println("The second die rolled a " + die2);
////
////        result = die1 + die2;
////        System.out.println("Result of both dice is: " + result);
////
////        if(wantsToContinue()) {
////            diceRoller();
////        } else {
////            System.out.println("Thanks for playing \"D I C E   R O L L E R \"!");
////        }
////
////    }
////
////    public static int roll(int numberOfSides) {
////        return (int) Math.ceil(Math.random() * numberOfSides);
////    }
////
//    public static void diceSplash() {
//        String display1 = "\n\n" +
////
//                "     | o     | | / import java.util.Scanner;\n" +
//                "\n" +
//                "public class MethodsExercises {\n" +
//                "    public static void main(String[] args) {\n" +
//                "\n" +
//                "        int number1 = getInteger(1, 10);\n" +
//                "        int number2 = getInteger(10, 33);\n" +
//                "\n" +
//                "        double sum = add(number1, number2);\n" +
//                "        double difference = subtract(number1, number2);\n" +
//                "        double product = multiplication(number1, number2);\n" +
//                "        double quotient = divide(number1, number2);\n" +
//                "\n" +
//                "        System.out.println(\"The sum of \" + number1 + \" and \" + number2 + \" is: \" + sum);\n" +
//                "        System.out.println(\"The difference of \" + number1 + \" and \" + number2 + \" is: \" + difference);\n" +
//                "        System.out.println(\"The sum product of \" + number1 + \" and \" + number2 + \" is: \" + product);\n" +
//                "        System.out.println(\"The quotient of \" + number1 + \" and \" + number2 + \" is: \" + quotient);\n" +
//                "\n" +
//                "        System.out.println(\"Now we're going to calculate factorials!\");\n" +
//                "        int userInt;\n" +
//                "        long factorialResult;\n" +
//                "\n" +
//                "        do {\n" +
//                "            userInt = getInteger(1, 10);\n" +
//                "            factorialResult = factorial(userInt);\n" +
//                "            System.out.println(\"The factorial for \" + userInt + \"! is \" + factorialResult);\n" +
//                "        } while(wantsToContinue());\n" +
//                "\n" +
//                "        System.out.println(\"Thanks for playing \\\"Factorial!\\\"\");\n" +
//                "\n" +
//                "        System.out.println();\n" +
//                "        System.out.println(\"Now let's play \\\"Roll The Dice!\\\"\");\n" +
//                "        diceRoller();\n" +
//                "    }\n" +
//                "\n" +
//                "    public static double add(double a, double b) {\n" +
//                "        return a + b;\n" +
//                "    }\n" +
//                "\n" +
//                "    public static double subtract(double a, double b) {\n" +
//                "        return a - b;\n" +
//                "    }\n" +
//                "\n" +
//                "    public static double multiplication(double a, double b) {\n" +
//                "        return a * b;\n" +
//                "    }\n" +
//                "\n" +
//                "    public static double divide(double a, double b) {\n" +
//                "        return a / b;\n" +
//                "    }\n" +
//                "\n" +
//                "    public static double modulo(double a, double b) {\n" +
//                "        return a % b;\n" +
//                "    }\n" +
//                "\n" +
//                "    public static int getInteger(int min, int max) {\n" +
//                "        System.out.println(\"Please input an integer between \" + min + \" and \" + max + \":\");\n" +
//                "        Scanner scan = new Scanner(System.in);\n" +
//                "        int number = scan.nextInt();\n" +
//                "        if(number < min || number > max) {\n" +
//                "            return getInteger(min, max);\n" +
//                "        } else {\n" +
//                "            return number;\n" +
//                "        }\n" +
//                "    }\n" +
//                "\n" +
//                "    public static boolean wantsToContinue() {\n" +
//                "        System.out.println();\n" +
//                "        Scanner scan = new Scanner(System.in);\n" +
//                "        String userSelection;\n" +
//                "        boolean wantsToContinue;\n" +
//                "\n" +
//                "        System.out.println(\"Would you like to continue? Type \\\"y\\\" or yes to continue.\");\n" +
//                "        userSelection = scan.next();\n" +
//                "        wantsToContinue = userSelection.equalsIgnoreCase(\"y\") || userSelection.equalsIgnoreCase(\"yes\");\n" +
//                "\n" +
//                "        return wantsToContinue;\n" +
//                "    }\n" +
//                "\n" +
//                "    public static long factorial(int num) {\n" +
//                "        // set the output at\n" +
//                "        long output = num;\n" +
//                "\n" +
//                "        // start w/ 1, then multiply by each number up to but not including the num.\n" +
//                "        for(int i = 1; i <= 5; i++) {\n" +
//                "            output *= i;\n" +
//                "        }\n" +
//                "\n" +
//                "        return output;\n" +
//                "    }\n" +;
//
////                "\n" +
////                "    public static void diceRoller() {\n" +
////                "        diceSplash();\n" +
////                "\n" +
////                "        System.out.println(\"How many sides should each die have?\");\n" +
////                "        int sides = getInteger(1, 100);\n" +
////                "        int die1;\n" +
////                "        int die2;\n" +
////                "        int result;\n" +
////                "\n" +
////                "        die1 = roll(sides);\n" +
////                "        System.out.println(\"The first die rolled a \" + die1);\n" +
////                "\n" +
////                "        die2 = roll(sides);\n" +
////                "        System.out.println(\"The second die rolled a \" + die2);\n" +
////                "\n" +
////                "        result = die1 + die2;\n" +
////                "        System.out.println(\"Result of both dice is: \" + result);\n" +
////                "\n" +
////                "        if(wantsToContinue()) {\n" +
////                "            diceRoller();\n" +
////                "        } else {\n" +
////                "            System.out.println(\"Thanks for playing \\\"D I C E   R O L L E R \\\"!\");\n" +
////                "        }\n" +
////                "\n" +
////                "    }\n" +
////                "\n" +
////                "    public static int roll(int numberOfSides) {\n" +
////                "        return (int) Math.ceil(Math.random() * numberOfSides);\n" +
////                "    }\n" +
////                "\n" +
////                "    public static void diceSplash() {\n" +
////                "        String display1 = \"\\n\\n\" +\n" +
////                "
////                "        String display2 = \"\\n\" +\n" +
////                "                \"              _______.\\n\" +\n" +
////                "                \
////                "                + \"\\n\\n\";\n" +
////                "\n" +
////                "\n" +
////                "        String display3 = \"\\n\" +\n" +
////                "
////                "                + \"\\n\\n\";\n" +
////                "\n" +
////                "        int randomDisplay = roll(3);\n" +
////                "\n" +
////                "        String display;\n" +
////                "\n" +
////                "        if(randomDisplay == 1) {\n" +
////                "            display = display1;\n" +
////                "        } else if(randomDisplay == 2) {\n" +
////                "            display = display2;\n" +
////                "        } else {\n" +
////                "            display = display3;\n" +
////                "        }\n" +
////                "\n" +
////                "        System.out.println(display);\n" +
////                "    }\n" +
////                "\n" +
////                "}  o\\_____\\\n" +
////                "     " +
////                "     '-------'     \\/____o/ \n\n\n";
////
////        String display2 = "\n" +
////                "              _______.\n" +
////                "
////                + "\n\n";
////
////
////        String display3 = "\n" +
////                 /\n" +
////                "          \\'__'\\/"
////                + "\n\n";
////
////        int randomDisplay = roll(3);
//
////        String display;
////
////        if(randomDisplay == 1) {
////            display = display1;
////        } else if(randomDisplay == 2) {
////            display = display2;
////        } else {
////            display = display3;
////        }
//
////        System.out.println(display);
//    }
//}
////
//
////}
////intArray = new int[]{
////            "When someone says they love running",
////            "When your STD test comes back positive",
////            "When some says they\'re more of a car person than a dog person",
////            "When you Google the lyrics and realize you\'ve been singing nonsense this whole time",
////            "When it\'s winter so you don\'t have to shave your legs anymore",
////            "When you spell a word so wrong that even spell check can\'t figure out what the fuck you\'re trying to say",
////            "When you get a notification but it\'s from Team SnapChat",
////            "When you see all your friends prancing around in their bikinis but you can\'t participate because tacos are life",
////            "When you rap the whole verse correctly",
////            "When you can\'t stop laughing during a fucked up situation",
////            "When your crush says they\'re stuck at the office but their Snapchat is full of adventures",
////            "Wyou you wake up half-naked on the bathroom floor",
////            "When you find out the person you\'re dating has 3 kidss",
////            "When someone congratulates you on being pregnant but you\'re not pregnant",
////            "When you find your keys after 25 minutes",
////            "When you come to terms with the fact that you\'ll never be able to dunk a basketball",
////            "When  you hit the last lap in Mario Kart and the music speeds up",
////            "When someone asks if you voted for Donald  Trump",
////            "When your friend who lies about everything starts telling a story",
////            "When you open a birthday card and no money falls out",
////            "When you come back from vacation and your guinea pig is dead",
////            "When you get a blocked call",
////            "When  you hear a song and pretend to be in the music video",
////            "When you realize Guy Fieri makes millions of dollars a year eating food",
////            "When you say bye to someone then both walk in the same direction",
////            "When the flight attendant wakes you up from your coma to offer you a bag of stale peanuts",
////            "When you gotta pay taxes but all school taught you is how to calculate the circumferance of a parallelogram",
////            "When you try a risky new fashion trend and everyone loves it",
////            "When you try a risky new fashion trend and everyone hates it",
////            "When everyone at lunch is talking about what they got for Christmas but you\'re Jewish",
////            "When you fart in public and its super loud",
////            "When you fart in public and its quite but smells like death",
////            "When you fart and a little turd comes out",
////            "When you hit snooze 22 times and now  have 3 minutes to leave the housee",
////            "When you get to work on Monday morning and you remember its a holiday",
////            "When your food sounds like WW2 in the microwave but comes out cold",
////            "When you\'re drunk and hungry",
////            "When you stub your toe",
////            "When you hit your funny bone",
////            "When you see someone pour milk in their bowl before the cereal",
////            "When someone says check out their mixTape",
////            "When someone says that they don\'t watch Rick and Morty ",
////            "When you find out that girls poop",
////            "When you eat all the pizza rolls and remember the good times when you still had pizza rolls",
////            "When you find out he still lives with  his parents",
////            "When someone tells you that you look tired",
////            "When you get lost on faceBook for the past hour",
////            "When you get lost on youTube for the past hour",
////            "When you get lost on snapChat for the past hour",
////            "When you get lost on instagram for the past hour",
////            "When you get lost on google for the past hour",
////            "When he said he\'d text you after work but that was a year ago",
////            "When you\'re watching a movie with your parents and there\'s a sex scene",
////            "When they say Fifty Shades of Grey is their favorite book",
////            "When your\'re watching Chopped and the chef decides to make a vinaigrette with less than a minute left",
////            "When it\'s the first day of Spring Break and you get your period",
////            "When the shrooms finally dick in",
////            "When you hear someone talking shit about the former U.S. Vice President Joe Biden",
////            "When your president tries to grab you by the pussy",
////            "When you match with your therapist on Tinder",
////            "When your vibrator runs out of battery right before you finish",
////            "When someone walks in on you jerking off",
////            "when you remember what you looked like in the 6th grade",
////            "When you think he\'s gonna propose but he\'s just tying his shoe",
////            "When all four of your boyfriends are at the same bar",
////            "When all four of your girlfriends are at the same bar",
////            "That face you make while people sing happy birthday",
////            "When you hear your mom bragging about you to her book club",
////            "When the dentist asks you a question while their hands are in your mouth",
////            "When you\'re giving a presentation and someone says 'Speak Up''",
////            "When you sit down after somebody and the seat is warm",
////            "When you step on a Lego",
////            "When you step in dog shit",
////            "When you get gum in your hair",
////            "When your math teacher talks about hypotenuse but your hear High On Potenuse",
////            "When your wife gives birth to an Asian baby but neither of you are Asian",
////            "When your mom adds you on Snapchat",
////            "When you introduce 2 of your friends and they stop hanging out without you",
////            "When you find out that bees are dying at an alarming rate",
////            "When someone says goblal warming isn\'t a thing",
////            "When you realize that the tab",
////            "When your crush text you cute things like 'Wh's this?' and 'How\'d you get my number?'"
////
////