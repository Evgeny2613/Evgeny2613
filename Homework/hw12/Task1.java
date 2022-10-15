// Напишите функцию для сравнения двух Set<String> - не используйте Set.equals()

package Homework.hw12;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>(List.of("C", "B", "A"));
        Set<String> b = new HashSet<>(List.of("C", "A", "B"));

        System.out.println(setCheck(a, b));

    }

    public static boolean setCheck(Set<String> a, Set<String> b) {
        if (a.size() != b.size())
            return false;
        Queue<String> bQueue = new LinkedList<>();

        Iterator<String> aIterator = a.iterator();
        Iterator<String> bIterator = b.iterator();

        while (bIterator.hasNext())
            bQueue.add(bIterator.next());

        while (aIterator.hasNext()) {
            if (aIterator.next() != bQueue.remove())
                return false;
        }
        return true;
    }

}
