package lessons.lesson11;

public interface CustomDeque {
    void addFirst(int value);
    int getFirst() throws IndexOutOfBoundsException;
    int removeFirst() throws IndexOutOfBoundsException;

    void addLast(int value);
    int getLast() throws IndexOutOfBoundsException;
    int removeLast() throws IndexOutOfBoundsException;

    int size();
}
