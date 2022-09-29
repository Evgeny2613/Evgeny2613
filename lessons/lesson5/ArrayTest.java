package lessons.lesson5;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // Бинарный поиск и сортировка, массивы

        int[] numbers = new int[]{10, 20, 5, -40, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 100));
    }
}
