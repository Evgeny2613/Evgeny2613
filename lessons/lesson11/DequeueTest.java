package lessons.lesson11;

import java.util.*;

public class DequeueTest {
    public static void main(String[] args) {

    }

    public static boolean checkArray(List<Integer> a, int value) {
        Collections.sort(a);
        Deque<Integer> d = new ArrayDeque<>();
        d.addAll((a));
        int f = d.removeFirst();
        int l = d.removeLast();
        int p = f * l;
        while (!d.isEmpty()) {
            if (p > value)
                l = d.removeLast();
            else if (p < value)
                f = d.removeFirst();
            else
                return true;
        }
        return false;
    }
}
