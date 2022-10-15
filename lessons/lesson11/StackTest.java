package lessons.lesson11;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        // Stack - стопка подносов
        // LIFO - Last In, First Out
        // T Push (T) - добавление элемента
        // T pop() - удаляет элемент из стопки и возвращает его - EmpyStackException
        // T peek() - возвращает элемент, не удаляя его -  EmpyStackException
        // boolean empty()

        Stack<String> names = new Stack<>();
        names.push("Dima");
        names.push("Max");
        names.push("Alina");

        while (!names.empty())
            System.out.println(names.pop());
    }

    public static Collection<String> inverse(Collection<String> input) {
        List<String> result = new LinkedList<>();
        Stack<String> s = new Stack<>();
        for (String w : input)
            s.push(w);
        while (!s.empty())
            result.add(s.pop());
        return result;
    }

    // [ 10 20 30 40 50 60 70 80 90 100]
    // [ 50 40 30 20 10 60 70 80 90 100]


}
