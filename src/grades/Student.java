package grades;

import util.Input;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private double average;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {

        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
    }
    public static void main(String[] args) {
        Student student = new Student("JazzyJ");
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(95);
        System.out.println(student);
    }
}