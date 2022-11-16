package lessons.lesson17;

import java.util.ArrayList;
import java.util.List;

public class Lesson17 {
    public static void main(String[] args) {


//        NoArgsReturnsDouble noArgsReturnsDouble = new NoArgsReturnsDouble() {
//            @Override
//            public double function() {
//                return 3.14;
//            }
//        };

        NoArgsReturnsDouble noArgsReturnsDouble = () -> 3.14;

        System.out.println(noArgsReturnsDouble.function());

        TwoIntReturnsBoolean comparer = (value1, value2) -> value1 == value2;

        System.out.println(comparer.apply(10, 12));
        System.out.println(comparer.apply(15, 15));

        TwoIntReturnsBoolean isDividedBy = (value1, value2) -> value1 % value2 == 0;
        System.out.println(isDividedBy.apply(10, 5));
        System.out.println(isDividedBy.apply(10, 3));

        System.out.println(check(10, 12, comparer));
        System.out.println(check(10, 10, comparer));

        IntPredicate isOdd = i -> i % 2 == 0;
        List<Integer> ints = List.of(1, 3, 5, 8, 2, 17);

        List<Integer> result = filter(ints, isOdd);
        System.out.println(result);

        List<String> names = List.of("Max", "Alex", "Daria", "Sam");
        StringProcessor toUpperCase = String::toUpperCase;

        System.out.println(process(names, toUpperCase));

        Predicate<Integer> greaterThan5 = i -> i >= 5;
        Predicate<String> stringContainsR = s -> s.contains("R");

        System.out.println(filter(ints, greaterThan5));

        Predicate<String> stingContainsR = s -> s.contains("r");
        System.out.println(filter(names, stingContainsR));

        Predicate<String> stringStartsWithS = s -> s.startsWith("S");
        System.out.println(filter(names, stringStartsWithS));

        Predicate<String> complexPredicate = s -> {
            if (s.contains("r"))
                return true;
            if (s.length() >= 5)
                return true;
            return false;
        };

        TwoIntReturnInt sum = Integer::sum;
        TwoIntReturnInt multiply = TwoIntReturnInt::multiply;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();

        for (T i : list) {
            if (p.test(i))
                result.add(i);
        }
        return result;
    }

    public static List<String> process(List<String> list, StringProcessor p) {
        List<String> result = new ArrayList<>();

        for (String s : list)
            result.add(p.apply(s));
        return result;
    }

    public static List<Integer> filter(List<Integer> list, IntPredicate p) {
        List<Integer> result = new ArrayList<>();

        for (int i : list) {
            if (p.test(i))
                result.add(i);
        }

        return result;
    }

    public static boolean check(int k, int m, TwoIntReturnsBoolean c) {
        return c.apply(k, m);
    }
}