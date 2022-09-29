package lessons.lesson5;

public class Employee {
    private int id;
    private String name;
    private int baseSalary;

    private static int counter = 0;

    public Employee(String name, int baseSalary) {
        this.id = counter++;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}


