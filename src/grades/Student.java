package grades;
import java.util.ArrayList;
import java.util.Im


public abstract class Student {
private String name;
private ArrayList<Integer> grades;

public Student(String name){
    this.name = name;
    grades = new ArrayList<>();
    }

    public void addGrades(ArrayList<Integer> grades) {
        this.grades = grades;
        System.out.println()
    }
}





//    public String getName(String);
//    public double getGradeAverage;



