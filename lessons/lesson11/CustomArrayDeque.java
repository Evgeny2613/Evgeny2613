package lessons.lesson11;

public class CustomArrayDeque implements CustomDeque{

    private int[] source;
    private int size = 0;
    private int firstElementIndex = 0;

    private static final int CAPACITY = 4;

    public CustomArrayDeque() {
        source = new int[CAPACITY];
    }


    @Override
    public String toString() {
        String r = "[";
        for (int i = 0; i < size(); i++) {
            int v = source[(firstElementIndex + i) % source.length];
            r += v;
            if (i < size() - 1)
                r += ", ";
            else
                r += "]";
        }
        return r;
    }

    @Override
    public void addFirst(int value) {
        if (size() == source.length)
            increaseCapacity();
        firstElementIndex = (firstElementIndex - 1 + source.length) % source.length;
        source[firstElementIndex] = value;
        size++;
    }

    private void increaseCapacity() {
        int [] newSource = new int[source.length * 2];
        int j = 0;
        for (int i = firstElementIndex; i < source.length; i++) {
            newSource[j++] = source[i];
        }
        for (int i = 0; i < firstElementIndex; i++) {
            newSource[j++] = source[i];
        }
        firstElementIndex = 0;
        source = newSource;
    }

    @Override
    public int getFirst() throws IndexOutOfBoundsException {
        if (size() == 0)
            throw new IndexOutOfBoundsException();
        return source[firstElementIndex];
    }

    @Override
    public int removeFirst() throws IndexOutOfBoundsException {
        if  (size() == 0)
            throw new IndexOutOfBoundsException();
        int value = source[firstElementIndex];
        firstElementIndex = (firstElementIndex + 1 + source.length) % source.length;
        size--;
        return value;
    }

    @Override
    public void addLast(int value) {
        if (size() == source.length)
            increaseCapacity();
        int lastElementIndex = (firstElementIndex + size()) % source.length;
        source[lastElementIndex] = value;
        size++;
    }

    @Override
    public int getLast() throws IndexOutOfBoundsException {
        if (size() == 0)
            throw new IndexOutOfBoundsException();
        int lastElementIndex = (firstElementIndex + size() - 1) % source.length;
        return source[lastElementIndex];
    }

    @Override
    public int removeLast() throws IndexOutOfBoundsException {
        if (size == 0)
            throw new IndexOutOfBoundsException();
        int lastElementIndex = (firstElementIndex + size() - 1) % source.length;
        int r = source[lastElementIndex];
        size--;
        return r;
    }


    @Override
    public int size() {
        return size;
    }
}
