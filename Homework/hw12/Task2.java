/* Напишите функцию которая найдет в передаваемом в нее List<Integer>
 наибольшую последовательность четных чисел и вернет ее в виде List<Integer>.
  Пример: [1,2,5,6,8,7,4] ->[6,8]
 */


package Homework.hw12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(1, 2, 5, 6, 8, 7, 4);

        System.out.println(maxEvenOrder(a));
    }

    public static List<Integer> maxEvenOrder(List<Integer> a) {
        Queue<Integer> evenOrder = new LinkedList<>(a);

        List<Integer> evenList = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();

        while (!evenOrder.isEmpty()) {
            int value = evenOrder.remove();

            if (value % 2 == 0)
                currentList.add(value);
            else if (value % 2 != 0) {
                if (currentList.size() > evenList.size()) {
                    evenList.clear();
                    evenList.addAll(currentList);
                }
                currentList.clear();
            }
        }

        if (currentList.size() > evenList.size())
            return currentList;
        else
            return evenList;
    }
}
