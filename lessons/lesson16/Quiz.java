package lessons.lesson16;

import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        List<Integer> ints =  List.of(6, 5, 4, 3, 2, 1, 0);
        System.out.println(sumLastN(ints, 5));

        List<String> strings = new ArrayList<>(Arrays.asList("Max", "Daria", "Masha", "Alex", "Ron"));
        System.out.println(getLengthFrequency(strings));


    }

    public static Map<Integer, Integer> getLengthFrequency(List<String> strings) {
        Map<Integer, Integer> stringsLengthsMap = new HashMap<>();

        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()) {
            int wordLengths = stringIterator.next().length();

            if (stringsLengthsMap.containsKey(wordLengths))
                stringsLengthsMap.replace(wordLengths, stringsLengthsMap.get(wordLengths) + 1);
            else
                stringsLengthsMap.put(wordLengths, 1);
        }
        return stringsLengthsMap;
    }

    public static int sumLastN(List<Integer> ints, int number) {
        Deque<Integer> intsDeque = new ArrayDeque<>(ints);
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum += intsDeque.removeLast();
        }
        return sum;
    }
}
