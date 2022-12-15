package lessons.lesson30;

import java.util.Arrays;
import java.util.Comparator;

public class TestOfGenerics {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

    }

    public static <T> void swapElementPlace(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T> T firstElement(T[] a) {
        return a[0];
    }

    public static <T> T getMax(T[] a, Comparator<T> comparator) {
        return Arrays.stream(a)
                .max(comparator)
                .orElse(null);
    }
}
