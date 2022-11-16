package lessons.lesson18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Lesson18 {
    public static void main(String[] args) {

        long timeBefore = System.currentTimeMillis();

        Consumer<String> stringConsumer = System.out::println;

        List<String> names = List.of("Max", "Daria", "Alexandra", "Michael");

        Consumer<String> stringConsumerMod = s -> {
            System.out.println("Dear, " + s);
        };

        names.stream().forEach(stringConsumerMod);

        Function<String, Integer> stringIntegerFunction = String::length;

        System.out.println(stringIntegerFunction.apply("Domain"));

        names.stream()
                .map(stringIntegerFunction)
                .forEach(System.out::println);

        Map<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("Daria", 3200);
        salaryMap.computeIfAbsent("John", s -> 800 * s.length());

        System.out.println(salaryMap);

        Function<String, String> quoteFunction = s -> "'" + "s" + "'";

        Function<String, Integer> nameToSalaryFunction = s -> 800 * s.length();

        salaryMap.computeIfAbsent("Suzana", quoteFunction.andThen(nameToSalaryFunction));

//        salaryMap.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println("User " + s + " salary is " + integer);
//            });

        Supplier<Double> lazyValue = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return Math.random() * 2000;
        };
        System.out.println("Supplier value " + lazyValue.get());
        long timeafter = System.currentTimeMillis();

        Supplier<Long> timeSupplier = () -> timeafter - timeBefore;
        System.out.println(timeSupplier.get());

        names.stream()
                .filter(s -> s.contains("x"))
                .forEach(System.out::println);

        Predicate<String> moreThan4Letter = s -> s.length() > 4;

        names.stream().filter(moreThan4Letter)
                .forEach(string -> System.out.println("More than 4 " + string));


        int[] numbers = new int[]{1, 3, 5, 7, 9, 11};

        int sum = Arrays.stream(numbers)
                .reduce(0, Integer::sum);

        System.out.println("sum is: " + sum);



        names.stream()
                .reduce("", (l, r) -> l.equals("") ? r : l + "," + r);
    }
}
