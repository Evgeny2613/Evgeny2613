package lessons.lesson5;

public class Manager extends OfficeEmployee{
    private double coefficient;

    public Manager(String name, int baseSalary, int monthlyBonus, double coefficient) {
        super(name, baseSalary, monthlyBonus);
        this.coefficient = coefficient;
    }

    @Override
    public int getSalary() {
        return (int)(super.getSalary() * coefficient);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "coefficient=" + coefficient +
                '}';
    }
}
