package lessons.lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniversityTester {
    public static void main(String[] args) {
        Professor johnson = new Professor("Peter Johnson", new ArrayList<>());
        Professor simon = new Professor("Alex Simon", new ArrayList<>());

        johnson.addStudent(new Student("Marla Gray", 23, "music"));
        johnson.addStudent(new Student("Max Smith", 24, "physics"));
        johnson.addStudent(new Student("Masha Gessen", 22, "culture"));
        johnson.addStudent(new Student("Sam Collins", 20, "math"));

        simon.addStudent(new Student("Bobby Brown", 25, "music"));
        simon.addStudent(new Student("Elvis Presley", 26, "music"));

        List<Professor> professors = new ArrayList<>();
        professors.add(johnson);
        professors.add(simon);

        System.out.println(professors);

        Collections.sort(professors, Professor.byStudentNumber);
    }
}
