package lessons.lesson21;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Michael", "Svetlov", 24),
                new Student("Alexander", "Svetlov", 28),
                new Student("Daria", "Pettovskaya", 19),
                new Student("Maria", "Drobisheva", 19),
                new Student("Max", "Pavlov", 24)
        );

        List<Student> hasSInLastName = students.stream()
                .filter(s -> s.getLastName().toLowerCase().contains("s"))
                .collect(Collectors.toList());

        System.out.println(hasSInLastName);

        System.out.println(
                students.stream()
                        .map(Student::getLastName)
                        .collect(Collectors.toSet())
        );


        Map<Integer, List<Student>> studentByAge = students.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        System.out.println(studentByAge);

        Map<String, List<Student>> studentByGender = students.stream()
                .collect(Collectors.groupingBy(s -> {
                    if (s.getLastName().endsWith("a"))
                        return "Female";
                    else
                        return "Male";
                }));
        System.out.println(studentByGender);

        Map<Boolean, List<Student>> partitionByGender = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getLastName().endsWith("a")));

        System.out.println(partitionByGender);

        Map<String, Student> fioToStudent = students.stream()
                .collect(Collectors.toMap(
                        s -> s.getLastName() + " " + s.getFirstName(), Function.identity()
                ));

        partitionByGender.entrySet().stream()
                        .forEach(e ->
                        {
                            String gender = e.getKey() ? "f" : "m";
                            System.out.println(gender + " " + e.getValue().size());
                        }
                        );


        System.out.println(fioToStudent);

        DoubleSummaryStatistics ageStatistics = students.stream()
                .collect(Collectors.summarizingDouble(Student::getAge));

        System.out.println(ageStatistics.getMax());
        System.out.println(ageStatistics.getAverage());

        String lastNames = students.stream()
                .map(Student::getLastName)
                .collect(Collectors.joining(";", "{", "}"));

        System.out.println(lastNames);

        partitionByGender.entrySet().stream()
                .forEach(e -> {
                    String gender = e.getKey() ? "f" : "m";
                    int sum = e.getValue().stream().map(Student::getAge).reduce(0, Integer::sum);
                    System.out.println(gender + " " + sum);
                });


        Collector<Student, Map<Integer, List<Student>>, Map<Integer, List<Student>>> ageCollector = new Collector<Student, Map<Integer, List<Student>>, Map<Integer, List<Student>>>() {
            @Override
            public Supplier<Map<Integer, List<Student>>> supplier() {
                return () -> new HashMap<>();
            }

            @Override
            public BiConsumer<Map<Integer, List<Student>>, Student> accumulator() {
                return new BiConsumer<Map<Integer, List<Student>>, Student>() {
                    @Override
                    public void accept(Map<Integer, List<Student>> integerListMap, Student student) {

                    }
                };
            }

            @Override
            public BinaryOperator<Map<Integer, List<Student>>> combiner() {
                return null;
            }

            @Override
            public Function<Map<Integer, List<Student>>, Map<Integer, List<Student>>> finisher() {
                return null;
            }

            @Override
            public Set<Characteristics> characteristics() {
                return Set.of(Characteristics.UNORDERED);
            }
        };
    }
}
