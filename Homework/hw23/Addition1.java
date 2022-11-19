package Homework.hw23;

//С помощью Stream-ов отсортируйте список строк, сравнив их по подстрокам со ВТОРОГО символа по последний.
// Т.е., для элемента "Max" подстрока для сравнения должна быть "ax".

import java.util.Comparator;
import java.util.List;

public class Addition1 {
    public static void main(String[] args) {
        List<String> countries = List.of("Canada", "France", "Poland", "Germany", "England", "United States", "Argentine");

        countries.stream()
                .sorted(Comparator.comparing(c-> c.charAt(1)))
                .forEach(System.out::println);
    }
}
