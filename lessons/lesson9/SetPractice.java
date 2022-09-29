package lessons.lesson9;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        // java Set implementation. Exercises
        // Set - коллекция, которая хранит неповторяющийся набор данных
        // применение - поиск уникальных элементов.


        // Set - интрефейс
        //HashSet - основана на хештаблице
        // LinkedHashSet - обход элеменентов в порядке вставки
        //TreeSet - возвращает все элемент при обходе в отсортированном виде

        Set<String> groups = new HashSet<>();
        groups.add("Abba");
        groups.add("Beatles");
        groups.add("Rolling Stones");
        groups.add("Deep purple");
        groups.add("Led Zeppelin");

        System.out.println(groups);
        System.out.println(groups.contains("Eurithmics"));
        System.out.println(groups.contains("Abba"));
        System.out.println(groups.size());
        groups.add("Abba");
        System.out.println(groups.size());

        Iterator<String> groupsIterator = groups.iterator();
        while (groupsIterator.hasNext())
            System.out.println(groupsIterator.next());

        for (String g : groups)
            System.out.println(g);

        List<String> britishGroups = Arrays.asList("Oasis", "Blur", "Suede", "Beatles", "Rolling Stones");

        groups.addAll(britishGroups);
        groups.containsAll(britishGroups);
        groups.removeAll(britishGroups);
        groups.retainAll(britishGroups); // оставить в сете группы только элементы из коллекции

        System.out.println(getUniqueCharacters("Hello, world!"));

        // поиск дубликатов
        // есть набор данных
        // нужно распечатать те элементы, которые встречаются более одного раза

        System.out.println(getDoubles("Cat Dog Cat Dog Chicken Mouse"));


        // int Object.hashCode()
        //  Vasya -> 334
        //boolean Object.equals(Object o)

        System.out.println("Vasya".hashCode());

        // нужно в классе, который собираемся хранить в хэш-контейнере HashMap, HashSet ....
        // hash code и equals
        // контракт:
        //1.  на протяжении жизни обьекта hashCode() должна возвращать ОДНО И ТО-ЖЕ ЗНАЧЕНИЕ int
        //2. если 01.equals(o2) то это означает что 01.hashCode() == 02.hashCode()


        // при этом разные неэквивалентные обьекты могут иметь одинаковый hashCode();
    }

    public static Collection<String> getDoubles(String s) {
        Set<String> doubles = new HashSet<>(); // only duplicates
        Set<String> data = new HashSet<>(); // words
        String[] w = s.split(" ");

        for (String word : w) {
            if (data.contains(word))
                doubles.add(word);
            data.add(word);
        }
        return doubles;
    }


    private static Collection<String> getUniqueCharacters(String s) {
        Set<String> result = new HashSet<>();

        List<String> letters = Arrays.asList(s.split(""));
        result.addAll(letters);

        return result;
    }
}
