package lessons.lesson14;

public class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String speciality) {
        this.name = name;
        this.age = age;
        this.major = speciality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "S{" +
                "n='" + name + '\'' +
                ", a=" + age +
                ", s='" + major + '\'' +
                '}';
    }
}
