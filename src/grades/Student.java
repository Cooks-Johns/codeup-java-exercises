package grades;
import java.util.ArrayList;


public abstract class Student {
    private final double getGradeAverage;
    private String getName;
    private int addGrade;
    public double gradeAverage;
    private String name;

    public Student(String getName, int addGrade, double getGradeAverage) {
        this.getName = getName;
        this.addGrade = addGrade;
        this.getGradeAverage = getGradeAverage;
    }
//
//    // returns the students's name
//    public String getName(String name) {
//
//        return name;
//    }
//
//    // adds the given grade to the gradeas property
//    public int addGrade(int grade) {
//        return grade;
//    }
//
//    // returns the average of the students grades
//
//    public double getGradeAverage(double gradeAve) {
//        this.gradeAverage = gradeAve;
//        return gradeAve;
//        }
//
//
//        class StudentNames extends Student {
//        public String getName;
//
//            public StudentNames(String getName, int addGrade, double getGradeAverage) {
//                super(getName, addGrade, getGradeAverage);
//            }
//        return
//        }



    public static void main(String args[]) {

        HashMap<String, Integer> gardes = new HashMap<>();

//        grades.put("John", new );


        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("John");
        studentNames.add("Byryan");
        studentNames.add("Nestor");
        studentNames.add("Jake");
        studentNames.add("Steven");
        studentNames.add("Rob");

        System.out.println(studentNames);




    }






}





//    public String getName(String);
//    public double getGradeAverage;



