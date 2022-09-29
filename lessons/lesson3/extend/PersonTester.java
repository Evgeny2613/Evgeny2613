package lessons.lesson3.extend;

public class PersonTester {
    public static void main(String[] args) {
        Person michail = new Person("Michail Svetlov","Pasechnya 14");

        System.out.println(michail);


        Student kostya = new Student("Kostya Steklov", "Tsvetochnaya 1", "music", 3);
        kostya.setProgram("Physics");
        kostya.setYear(2);

        Staff ivan = new Staff("Ivan Ivanov", "Yablochniy 16", "math", 25_000);

        Person p = new Student("Alexey Sokolov", "Kurskaya street 17", "math", 1);
        if (p instanceof Student) {
            System.out.println("Student");
            Student s = (Student) p;
            s.setYear(6);
            System.out.println(s);
        }
    }
}
