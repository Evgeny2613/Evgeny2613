package lessons.lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Professor {
    private String name;
    private List<Student> students = new ArrayList<>();

    public static Comparator<Professor> byStudentNumber = new Comparator<Professor>() {
        @Override
        public int compare(Professor o1, Professor o2) {
            return Integer.compare(o1.students.size(), o2.students.size());
        }
    };

    public void addStudent(Student student) {
        students.add(student);
    }

    public Professor(String name, List<Student> students) {
        this.name = name;

        this.students = students;
    }

    public String getName() {
        return name;
    }


    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "P{" +
                "n='" + name + '\'' +
                ", s=" + students +
                '}';
    }
}
