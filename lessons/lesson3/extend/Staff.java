package lessons.lesson3.extend;

public class Staff extends Person{
    private String faculty;
    private int salary;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Staff(String name, String address, String faculty, int salary) {
        super(name, address);
        this.faculty = faculty;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Staff[name:'%s', address: '%s', faculty '%s', salary:'%d']", getName(), getAddress(), getFaculty(), getSalary());
    }
}
