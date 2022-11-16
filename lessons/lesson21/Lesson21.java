package lessons.lesson21;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;

public class Lesson21 {
    public static void main(String[] args) {
        List<String> names = List.of("Max", "Masha", "Daria", "Alexander");

        names.stream()
                .filter(n -> n.contains("r"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        names.stream()
                .map(n -> new AbstractMap.SimpleEntry<String, Integer>(n, n.length()))
                .filter(e -> e.getValue() > 5)
                .forEach(System.out::println);

        names.stream()
                .min(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
    }
}
