package lessons.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee dima = new Employee("Dima Goborov", 2_200);

        Employee masha = new OfficeEmployee("Masha Simonova", 2_350, 500);

        Employee max = new HourlyEmployee("Max Kotkov", 1_800, 120);
        Employee galina = new Manager("Galina Petrovskaya", 2_100, 400, 1.2);
        List<Employee> workers = new ArrayList<>(Arrays.asList(dima, masha, max, galina));
        for (Employee e : workers) {
            System.out.println("Name " + e.getName() + " salary " + e.getSalary());
        }

        Employee[] personnel = {dima, masha, max, galina};
        // int search = Arrays.binarySearch(personnel, dima);
        //System.out.println("ok");
        //if (search >= 0)
          //  System.out.println("This employee is in the company");
        //else
            //System.out.println("There is no such employee in the company");
    }

}
