package Homework.hw26.Ex2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "EMPLOYEES")
public class CompanyEmployees {
    private String date;
    private int amount;

    List<Employee> employees;

    public CompanyEmployees() {
    }

    public CompanyEmployees(String date, int amount, List<Employee> employees) {
        this.date = date;
        this.amount = amount;
        this.employees = employees;
    }

    public String getDate() {
        return date;
    }

    @XmlAttribute(name = "date")
    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    @XmlAttribute(name = "amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @XmlElement(name = "EMPLOYEE")
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                ", employees=" + employees +
                '}';
    }


}
