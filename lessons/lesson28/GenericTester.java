package lessons.lesson28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericTester {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("it's a string");
        list.add(34);
        String s = (String) list.get(0);

        List<String> stringList = new ArrayList<>();
        stringList.add("it's a string");
        logInt(123);
        logString("ABC");

        log("Hello");
        log(2.34);
        log(234);


        OrderedPair<String, String> poland = new OrderedPair<>("Poland", "Warsaw");
        OrderedPair<String, String> gb = new OrderedPair<>("GB", "London");
        System.out.println(equals(poland, gb));

        String[] names = {"Dima", "Misha", "Masha"};

        System.out.println(fromArrayTiList(names, String::length));
    }

    public static <T extends Number & Comparable> List<T> fromArrayToList(T [] array, T bound) {
        return Arrays.stream(array)
                .filter(n -> n.compareTo(bound) > 0)
                .peek(e -> System.out.println("number: " + e.doubleValue()))
                .collect(Collectors.toList());
    }

    public static <T, R> List<R> fromArrayTiList(T [] array, Function<T, R> mapper) {
        return Arrays.stream(array)
                .map(mapper)
                .collect(Collectors.toList());
    }

    public static <T extends Number> List<T> fromArrayToList(T [] array) {
        return Arrays.stream(array)
                .peek(e -> System.out.println("number: " + e.doubleValue()))
                .collect(Collectors.toList());
    }

    public static <T> List<T> fromArrayToList(T [] array) {
        return Arrays.stream(array)
                .collect(Collectors.toList());
    }

    public static <K, V> boolean equals(OrderedPair<K, V> p1, OrderedPair<K,V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    // T - тип значения
    public static <T> void log(T value) {
        System.out.println(value.getClass().getSimpleName() + " " + value);
    }

    public static void logInt(int i) {
        System.out.println("Integer values is: " + i);
    }

    public static void logString(String s) {
        System.out.println("String is: " + s);
    }
}
