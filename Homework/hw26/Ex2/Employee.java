package Homework.hw26.Ex2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Employee {
    private String department;
    private String name;
    private String id;
    private String position;
    private String joinYear;
    private int salary;
    private String currency;
    private Double USDSalary;



    public Employee() {
    }

    public Employee(String department, String name, String position, String joinYear, int salary, String currency) {
        this.department = department;
        this.name = name;
        this.id = id;
        this.position = position;
        this.joinYear = joinYear;
        this.salary = salary;
        this.currency = currency;
    }

    public String getDepartment() {
        return department;
    }
    @XmlAttribute(name = "department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "NAME")
    public void setName(String name) {
        this.name = name;
    }


    public String getPosition() {
        return position;
    }

    @XmlElement(name = "POSITION")
    public void setPosition(String position) {
        this.position = position;
    }

    public String getJoinYear() {
        return joinYear;
    }

    @XmlElement(name = "JOINYEAR")
    public void setJoinYear(String joinYear) {
        this.joinYear = joinYear;
    }

    public int getSalary() {
        return salary;
    }

    @XmlElement(name = "SALARY")
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    @XmlElement(name = "CURRENCY")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getUSDSalary() {
        return USDSalary;
    }

    public void setUSDSalary(Double USDSalary) {
        this.USDSalary = USDSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", joinYear='" + joinYear + '\'' +
                ", salary=" + salary +
                ", currency='" + currency + '\'' +
                ", USDSalary=" + USDSalary +
                '}';
    }
}
