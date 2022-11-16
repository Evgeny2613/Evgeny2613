package lessons.lesson14;

import java.util.*;

public class FruitsTester {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>(
                Arrays.asList(
                        new Fruits("Guava", 68),
                        new Fruits("Kiwi", 61),
                        new Fruits("Bananas", 89),
                        new Fruits("Orange", 47),
                        new Fruits("Apple", 52)
                )
        );

        System.out.println(Collections.max(fruits, Comparator.comparing(Fruits::getCalories)));
        System.out.println(Collections.min(fruits, Comparator.comparing(Fruits::getName)));

        fruits.sort(Comparator.comparing(Fruits::getName));
        int position = Collections.binarySearch(
                fruits,
                new Fruits("Orange", 22),
                Comparator.comparing(Fruits::getName)
        );

        System.out.println(position);

        //TreeSet - набор уникальных элементов хранящихся в отсортированном порядке

        TreeSet<Fruits> fruitsTreeSet = new TreeSet<>(Comparator.comparingInt(Fruits::getCalories));

        List<String> groups = new ArrayList<>(
                List.of("Nirvana", "Pink floyd", "Rolling Stones", " Sex Pistols", "Pearl Jam", "AC/DC")
        );

        TreeSet<String> groupsTreeSet = new TreeSet<>(groups);
        System.out.println(groupsTreeSet);


        System.out.println(groupsTreeSet.tailSet("Ramones"));

        System.out.println(groupsTreeSet.subSet("Beatles", "Ramones"));


        fruitsTreeSet.addAll(fruits);
        System.out.println(fruitsTreeSet);
        System.out.println(fruitsTreeSet.subSet(new Fruits("Patata", 50), new Fruits("Patata", 70)));


    }
}
