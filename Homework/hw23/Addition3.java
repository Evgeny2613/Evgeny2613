package Homework.hw23;

// * С помощью Stream-ов посчитайте сумму нечетных элементов массива целых
// воспользовавшись наработками из предыдущего задания

import java.util.stream.IntStream;

public class Addition3 {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 10)
                .filter(i -> i % 2 != 0)
                .sum();
        System.out.println(sum);
    }
}
