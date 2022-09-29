package lessons.lesson7;

import lessons.lesson6.list.CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lesson7 {
    //Iterators

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList("Brazil", "Belgium", "Frane", "Spain"));
        for (String country : countries) {
            System.out.println(country);
        }


        CustomArrayList l = new CustomArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        Iterator<String> c = countries.iterator();
        while (c.hasNext())
            System.out.println(c.next());

        Iterator<Integer> custom = l.iterator();
        while (custom.hasNext())
            System.out.println(custom.next());


        for (int i : l) {
            System.out.println("foreach " + i);
        }

        Iterator<Integer> backward = l.backwardIterator();
        while (backward.hasNext())
            System.out.println(backward.next());

        System.out.println(check(Arrays.asList("Dima", "Masha"), Arrays.asList("Dima", "Masha")));



    }


    public static boolean check(List<String> f, List<String> s) {
      /*  for (int i = 0; i < f.size(); i++) {
            String first = f.get(i);
            String second = s.get(i);
            if (!first.equals(second))
                return false;
        }
        return true;
       */

        return f.equals(s);

    }


}
