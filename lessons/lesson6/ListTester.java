package lessons.lesson6;

import java.util.*;

public class ListTester {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>();
        capitals.add("Berlin");
        capitals.addAll(Arrays.asList("Vienna", "Prague", "London"));
        capitals.add(1, "Budapest");

        System.out.println(capitals);
        System.out.println(capitals.get(0));

        capitals.set(4, "Paris");
        System.out.println(capitals);

        System.out.println(capitals.size());

        capitals.remove(3);
        System.out.println(capitals);

        System.out.println(capitals.contains("Berlin"));

        Collections.sort(capitals);
        System.out.println(capitals);
    }
    }

