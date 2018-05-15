package grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        boolean cont;

        students.put("JazzyJ", new Student("JazzyJ"));

        students.get("JazzyJ").addGrade(99);
        students.get("JazzyJ"). addGrade(99);

        do {
            Student JazzyJ = students.get("JazzyJ");;
            System.out.printf("Welcome to the Grading app," + " \n" +
                    "here are some of the student names: " + " \n" +
            " JazzyJ ");

            String choice2 = sc.next();
            cont = choice2.equalsIgnoreCase("y");
        } while (cont);

    }

}