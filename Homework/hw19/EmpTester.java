package Homework.hw19;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpTester {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
                new Emp("Max Petrov", 22, "programmer"),
                new Emp("Ivan Shapovalov", 33, "analyst"),
                new Emp("Semen Dezhnev", 55, "manager"),
                new Emp("Oleg Petrov", 19, "intern"),
                new Emp("Katerina  Drogova", 31, "programmer"),
                new Emp("Nikolas Spivakov", 23, "analyst"),
                new Emp("Boris Moiseev", 48, "manager"),
                new Emp("Petr Sveshnikov", 37, "programmer"),
                new Emp("Alex Con", 33, "analyst"),
                new Emp("Olga Filimova", 27, "programmer")
        );


        //найдите самого молодого из работников
        Optional<Emp> theYoungest = employees.stream().min(Comparator.comparing(Emp::getAge));
        System.out.println(theYoungest);

//        распечатайте только имена всех работников - имя это первое слово до пробела
         List<String> empNames =  employees.stream()
                 .map(e -> e.getName().split(" "))
                 .map(a -> a[0])
                 .collect(Collectors.toList());
        System.out.println(empNames);

        //распечатать всех с возрастом больше 41 года
        List<Emp> employeesMore41 = employees.stream()
                .filter(emp -> emp.getAge() > 41)
                .collect(Collectors.toList());
        System.out.println(employeesMore41);

//        распечатать всех работников отсортировав их по профессии и потом по возрасту
        List<Emp> empSortProfAge = employees.stream()
                .sorted(Comparator.comparing(Emp::getAge))
                .sorted(Comparator.comparing(Emp::getPosition))
                .collect(Collectors.toList());
        System.out.println(empSortProfAge);

//        заджойнить имена всех работников старше 36 лет через ", " - имя это первое слово до пробела
        System.out.println(employees.stream()
                .filter(emp -> emp.getAge() > 36)
                        .map(Emp::getName)
                .collect(Collectors.joining(", ")));

//        посчитайте сумму возрастов работников

        System.out.println(employees.stream()
                        .map(Emp::getAge)
                .reduce(Math::addExact)
        );

//        посчитайте количество программистов
        int amountOfProgrammers = (int) employees.stream()
                .filter(p -> p.getPosition() == "programmer").count();
        System.out.println(amountOfProgrammers);

//        посчитайте средний возраст
        employees.stream()
                .map(Emp::getAge)
                .reduce((l, r) -> (l + r) / 2).ifPresent(System.out::println);

        //        разделите на две группы - старше 40 лет и младше
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge() > 41)));

//        найдите профессию самого "старого" из "молодых"
        System.out.println(employees.stream()
                .filter(e -> e.getAge() < 30)
                .max(Comparator.comparing(Emp::getAge))
                .map(Emp::getPosition)
        );

//        сгруппируйте по профессии
        Map<String, List<Emp>> groupingByPosition = employees.stream()
                .collect(Collectors.groupingBy(Emp::getPosition));
        System.out.println(groupingByPosition);

//        распечатать профессии и количество работников в ней
        Map<String, Long> workersByPosition = employees.stream()
                .collect(Collectors.groupingBy(Emp::getPosition, Collectors.counting()));
        System.out.println(workersByPosition);


//        вернуть средний возраст мужчин и женщин - у женщин фамилия оканчивается на "a"
        Optional<Integer> aveWomenAge = employees.stream()
                .filter(e -> e.getName().endsWith("a"))
                .map(Emp::getAge)
                .reduce((l, r) -> (l + r) / 2);
        System.out.println(aveWomenAge);

        Optional<Integer> aveMenAge = employees.stream()
                .filter(e -> !e.getName().endsWith("a"))
                .map(Emp::getAge)
                .reduce((l, r) -> (l + r) / 2);

        System.out.println(aveMenAge);
    }
}
