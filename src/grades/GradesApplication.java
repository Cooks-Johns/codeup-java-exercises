//package grades;
//
//import java.util.Scanner;
//import java.util.HashMap;
//
//
//public class GradesApplication {
//
//
//public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<String, Student> students = new HashMap<>();
//        boolean cont;
//
//        students.put("JazzyJ", new Student("JazzyJ"));
//
//        students.get("JazzyJ").addGrade(99);
//        students.get("JazzyJ").addGrade(96);
//        students.get("JazzyJ").addGrade(97);
//
//
//
//    try {
//        do {
//            Student JazzyJ = students.get("JazzyJ");;
//            System.out.printf("Welcome to the Grading app," + " \n" +
//                    "here are some of the student names: " + " \n" +
//                    " JazzyJ ");
//            String choice = sc.next();
//            if (choice.equalsIgnoreCase("dug")) {
//                System.out.println("You selected " + JazzyJ.getName() +
//                        ", who has a grade average of " + JazzyJ.getGradeAverage());
//            } else {
//                System.out.print("That's not one of our students... try again.\n" +
//                        ">");
//            }
//
//            System.out.print("Would you like to look at another student's information? Y | N : ");
//            String choice2 = sc.next();
//            cont = choice2.equalsIgnoreCase("y");
//    } catch () {
//            while (cont);
//    }
//
//
//}