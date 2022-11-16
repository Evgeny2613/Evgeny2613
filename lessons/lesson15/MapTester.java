package lessons.lesson15;

import java.util.*;

public class MapTester {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Hungary", "Budapest");
        capitals.put("Poland", "Warsaw");
        capitals.put("Estonia", "Tallinn");
        capitals.put("Moldova", "Kishinau");
        capitals.put("Austria", "Vienna");

        System.out.println(capitals.size());
        System.out.println(capitals.get("Poland"));
        System.out.println(capitals.containsKey("France"));

        System.out.println(capitals.containsValue("Vienna"));

        Set<String> keys = capitals.keySet();
        for (String k : keys)
            System.out.println("key is: " + k);

        Collection<String> values = capitals.values();
        for (String v : values)
            System.out.println("value is: " + v);

        Set<Map.Entry<String, String>> entries = capitals.entrySet();
        for (Map.Entry<String, String> e : entries)
            System.out.println("entry with key: " + e.getKey() + " and value: " + e.getValue());

        String tolstoy = "Лев Толстой вел дневники большую часть своей жизни. В них он не только описывал события, но и рассуждал о собственных моральных качествах, литературе и высоком предназначении писателя. Если решите вести дневник как Лев Толстой, в нем вам придется разговаривать с самим собой прежде всего ставить цели на будущее:";
        Map<String, Integer> frequency = frequency(tolstoy);
        Set<Map.Entry<String, Integer>> entrySet = frequency.entrySet();


        TreeMap<String, Integer> treeFrequency = new TreeMap<>(frequency);
        System.out.println(treeFrequency);

    }

    public static Map<String, Integer> frequency(String string) {
        Map<String, Integer> words = new HashMap<>();
        string = string.replaceAll("\\.", "");
//        string = string.replaceAll(",", "");
//        string = string.replaceAll("-", "");

        string = string.replaceAll("[.,-]", "");
        string = string.toLowerCase();
        String[] w = string.split(" ");
        for (int i = 0; i < w.length; i++) {
            String word = w[i];

            if (words.containsKey(word)) {
                Integer value = words.get(word) + 1;
                words.put(word, value);
            } else {
                words.put(word, 1);
            }

        }

        return words;
    }
}
