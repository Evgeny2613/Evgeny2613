package lessons.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson6 {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>(Arrays.asList("Max", "Alexander", "Sam", "Sergey"));

        System.out.println(filterNames(4, name));
    }

    public static List<String> filterNames(int minLength, List<String> names) {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.length() >= minLength)
                ret.add(name);
        }

        return ret;
    }
}
