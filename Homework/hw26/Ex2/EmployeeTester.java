package Homework.hw26.Ex2;

import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTester {
    public static void main(String[] args) {
        Double rateCAD = Objects.requireNonNull(gettingCADRAte()).getRates().get("USD");
        try {
            JAXBContext context = JAXBContext.newInstance(CompanyEmployees.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            CompanyEmployees employees = (CompanyEmployees) unmarshaller.unmarshal(new File("employee.xml"));

            settingUSDSalary(employees, rateCAD);

            System.out.println("The average salary of the employee in the company is: $" + aveSalaryOfEmployee(employees, rateCAD).get());
            System.out.println("The following employees work in the company: " + employeesNames(employees));
            System.out.println("Employees names by department: " + employeesByDepartment(employees));



        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public static void settingUSDSalary(CompanyEmployees employees, double rate) {
        employees.getEmployees().stream()
                .forEach(e -> {
                    if (e.getCurrency().equals("CAD"))
                        e.setUSDSalary(rate * e.getSalary());
                    else
                        e.setUSDSalary((double) e.getSalary());
                });
    }

    public static RateCurrency gettingCADRAte() {

        try {
            URL url = new URL("https://api.frankfurter.app/latest?amount=1&from=CAD&to=USD");

            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            Gson gson = new Gson();
            RateCurrency rate = gson.fromJson((Reader) bufferedReader, (Type) RateCurrency.class);

            return rate;


        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

    public static StringBuilder employeesNames(CompanyEmployees employees) {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < employees.getEmployees().size(); i++) {
            if (i != 0)
                names.append("; ");
            names.append(employees.getEmployees().get(i).getName());
        }
        return names;
    }

    public static Optional<Double> aveSalaryOfEmployee(CompanyEmployees employee, Double rate) {
       return employee.getEmployees().stream()
               .map(Employee::getUSDSalary)
               .reduce(Double::sum)
               .map(s -> s / employee.getAmount());
    }

    public static Map<String, List<Employee>> employeesByDepartment(CompanyEmployees employees){
        Map<String, List<Employee>> employeesByDepartment = employees.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        return employeesByDepartment;
    }

}
