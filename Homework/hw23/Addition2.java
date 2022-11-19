package Homework.hw23;

//С помощью Stream-ов распечатайте нечетные элементы массива целых
// - воспользуйтесь IntStream.range(0, N) для генерации последовательности номеров элементов - подумайте,
// как превратить их в нечетные числа?

import java.util.stream.IntStream;

public class Addition2 {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .filter(i -> i % 2 != 0)
                .forEach(System.out::println);

    }
}
