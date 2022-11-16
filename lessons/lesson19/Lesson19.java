package lessons.lesson19;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson19 {
    public static void main(String[] args) {
        List<Integer> years = List.of(2002, 2022, 2021, 2017);

        years.stream()
                .filter(integer -> integer % 2 == 0)
                .filter(integer -> integer > 2010)
                .forEach(integer -> System.out.println("year is " + integer));

        List<String> countries = List.of("Canada", "Belgium", "Poland", "Estonia", "Hungary");

        countries.stream()
                .map(String::toUpperCase)
                .filter(string -> string.contains("N"))
                .map(string -> string + ":" + string.length())
                .forEach(System.out::println);


        int[] digits = new int[]{1, 2, 3, 4, 5};

        Arrays.stream(digits)
                .map(i -> i * i)
                .forEach(System.out::println);

        // creating stream with generate
        Stream<Double> randomDoubleStream =
                Stream.generate(() -> new Random().nextDouble())
                .limit(5);

        IntStream.range(1, 10)
                .skip(4)
                .limit(3)
                .forEach(System.out::println);

        List<String> names = List.of("Max", "Galina", "Alexandra", "Vlad");
        System.out.println(names.stream().allMatch(string -> string.length() > 2 && string.contains("a")));
        names.stream()
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

//         List<Integer> years = List.of(2002, 2022, 2021, 2017);

        int sum = years.stream().reduce(0, Integer::sum);
        System.out.println("years sum is: " + sum);

        Stream.of(2, 3, 7, 4).reduce(Math::multiplyExact).ifPresent(System.out::println);

        names.stream()
                .reduce((f, s) -> f + ", " + s)
                .ifPresent(System.out::println);

        List<String> filteredNames = names.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filteredNames);


        Map<String, Integer> nameToLength = names.stream()
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println(nameToLength);

        System.out.println(names.stream().collect(Collectors.joining("; ")));


        System.out.println(names.stream().collect(Collectors.groupingBy(String::length)));

        System.out.println(nameToLength);
        nameToLength.entrySet().stream()
                .forEach(entry -> System.out.println("key: " + entry.getKey() + " value: " + entry.getValue()));


    }
}
