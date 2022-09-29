package lessons.lesson5;

public class OfficeEmployee extends Employee{
    private int monthlyBonus;
    private Manager manager;


    public OfficeEmployee(String name, int baseSalary, int monthlyBonus) {
        super(name, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public int getSalary() {
        return getBaseSalary() + monthlyBonus;
    }

    public int getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(int monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "OfficeEmployee{" +
                "monthlyBonus=" + monthlyBonus +
                '}';
    }
}
