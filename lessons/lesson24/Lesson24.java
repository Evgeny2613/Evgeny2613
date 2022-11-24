package lessons.lesson24;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lesson24 {
    public static void main(String[] args) {
        // concordance index


        List<String> lines = List.of(
                "this is a cool climate",
                "hate this climate",
                "this brings relief to this pal",
                "cool hate"
        );

//        Map<String, Set<Integer>> concordance
        IntStream.range(0, lines.size())
                .mapToObj(line -> new AbstractMap.SimpleEntry<Integer, String>(line, lines.get(line)))
                .flatMap(entry -> Arrays.stream(entry.getValue().split(" "))
                        .map(w -> new AbstractMap.SimpleEntry<String, Integer>(w, entry.getKey()))
                )
                .forEach(System.out::println);
        ;
    }
}
