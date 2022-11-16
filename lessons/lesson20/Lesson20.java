package lessons.lesson20;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson20 {
    public static void main(String[] args) {
        List<List<String>> list = List.of(List.of("Max", "Alex"), List.of("Daria", "Masha", "Elenta"));

        list.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        Integer[][] ages = {{1, 2, 3},
                {4},
                {5, 6}
        };

        Arrays.stream(ages)
                .flatMap(Arrays::stream)
                .reduce(Math::addExact).ifPresent(System.out::println);


        Order grocery = new Order(
                new OrderItem("mango", 5, 1.45),
                new OrderItem("apples", 2, 1.55),
                new OrderItem("Red Bull", 10, 1.99)
        );

        Order utility = new Order(
                new OrderItem("Water", 104, 0.20),
                new OrderItem("Electricity", 201, 0.38)
        );

        List<Order> orders = List.of(grocery, utility);

        orders.stream()
                .flatMap(o -> o.getItems().stream())
                .map(l-> (l.getQuantity() * l.getUnitPrice()))
                .reduce(Double::sum)
                .ifPresent(System.out::println);


        List<Book> books = List.of(
                new Book("Kingdom of Heaven", "Max", "Sveta", "Dima"),
                new Book("Hello to Spartans", "Sveta", "Daria"),
                new Book("Movable feast", "Ivan", "Daria")
        );

        books.stream()
                .flatMap(b -> b.getAuthors().stream())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        list.stream()
                .flatMap(Collection::stream)
                .flatMap(name -> Arrays.stream(name.split("")))
                        .forEach(System.out::println);
    }
}
