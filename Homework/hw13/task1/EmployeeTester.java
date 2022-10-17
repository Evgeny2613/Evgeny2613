// Добавить тестовый список работников и отсортировать их по возрасту, потом по убыванию имен.

package Homework.hw13.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        new Employee(1, "Bob", 27, 1000),
                        new Employee(2, "Marie", 35, 2000),
                        new Employee(3, "Tom", 48, 3500),
                        new Employee(4, "Mohamed", 27, 1670),
                        new Employee(5, "Bob", 20, 1000)
                )
        );

        employees.sort(Comparator
                .comparingInt(Employee::getAge).reversed()
                .thenComparing(Employee::getName).reversed()
        );

        System.out.println(employees);
    }
}
