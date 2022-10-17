/* Создать класс Employee с полями id, name, age, salary.
 Добавить реализацию Comparable<Employee> по полю id.
  Добавить статические ссылки на компрататоры по salary, age и name.
   Добавить тестовый список работников и отсортировать их по возрасту, потом по убыванию имен.
 */

package Homework.hw13.task1;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private int salary;

    static Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);
    static Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getName);
    static Comparator<Employee> nameComparator = Comparator.comparing(Employee::getSalary);

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(getId(), o.getId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "i=" + id +
                ", n='" + name + '\'' +
                ", a=" + age +
                ", s=" + salary +
                '}';
    }
}
