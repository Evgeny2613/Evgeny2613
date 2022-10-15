package lessons.lesson11;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lesson11 {
    public static void main(String[] args) {
        // Queue - позволяет добавлять элементы в конец и забирать их сначала
        // FIFO - First-In, First-Out

        // добавление элемента в конец
        //boolean.add(E) если места нет выбрасывает исключение IllegalStateException
        // boolean. offer(E)

        // получение элемента из начала очереди
        // E remove() or NoSuchElementException
        // E poll() - возвращает первый элемент и убирает его из очереди

        // инспекция
        // E element() - возвращает первый элемент - NoSuchElementException
        // E peek() - если очередь пуста - null

        Queue<String> bankQueue = new LinkedList<>();
        bankQueue.offer("Masha Petrova");
        bankQueue.offer("Sveta Ivanova");
        bankQueue.offer("Semen Dejnev");

        String elem = "";
        while ((elem = bankQueue.poll()) != null)
            System.out.println(elem);


        // Priority queue - очереди с приоритетом

        Queue<String> priorityCustomers = new PriorityQueue<>();
        priorityCustomers.add("One");
        priorityCustomers.add("Two");
        priorityCustomers.add("Three");
        priorityCustomers.add("Four");
        priorityCustomers.add("Five");
        priorityCustomers.add("Six");

        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
    }
}
