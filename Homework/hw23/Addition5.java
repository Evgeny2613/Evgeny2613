package Homework.hw23;

// С помощью Stream-ов отфильтруйте список строк,
// распечатав только те из них, которые являются анаграммами
// т.е., одинаково выглядят при чтении вперед и назад - например, "алла".

import java.util.*;

public class Addition5 {
    public static void main(String[] args) {
        List<String> list = List.of("alla", "max", "anna", "alex");

        list.stream()
                .filter(n -> {
                    Deque<String> letters = new ArrayDeque<>(List.of(n.split("")));
                    while (!letters.isEmpty()) {
                        if (!letters.removeFirst().equals(letters.removeLast()))
                            return false;
                    }
                    return true;
                })
                .forEach(System.out::println);
    }
}
