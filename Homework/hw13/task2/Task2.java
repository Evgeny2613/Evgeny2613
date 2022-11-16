// Напишите функцию, принимающую на вход список целых и удалающую из списка все числа, встретившиеся нечетное количество раз.

package Homework.hw13.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 1, 2, 6, 7, 8, 6, 6, 7, 9));

        System.out.println(evenNumberOfDigits(list));
    }

    public static List<Integer> evenNumberOfDigits(List<Integer> list) {
        List<Integer> actualList = new ArrayList<>();

        Collections.sort(list);
        Queue<Integer> listQueue = new LinkedList<Integer>(list);

        while (!listQueue.isEmpty()) {
            int value = listQueue.remove();
            int counter = 1;

            while (!listQueue.isEmpty() && listQueue.peek() == value) {
                listQueue.remove();
                counter++;
            }
            if (counter % 2 == 0)
                actualList.add(value);

        }
        return actualList;

    }
}
