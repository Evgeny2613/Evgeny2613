package lessons.lesson11;

public class CustomArrayTester {
    public static void main(String[] args) {
        CustomArrayDeque deque = new CustomArrayDeque();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque.size());
        System.out.println(deque);
    }
}
