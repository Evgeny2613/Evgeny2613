package lessons.lesson5;

public class HourlyEmployee extends Employee{
    private int monthlyHours;

    public HourlyEmployee(String name, int baseSalary, int monthlyHours) {
        super(name, baseSalary);
        this.monthlyHours = monthlyHours;
    }

    @Override
    public int getSalary() {
        return getBaseSalary() * monthlyHours / 180;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "monthlyHours=" + monthlyHours +
                '}';
    }
}
