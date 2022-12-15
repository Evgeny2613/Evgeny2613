package lessons.lesson34;

public class Box <T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println("This is: " + value.getClass().getSimpleName() + " value is: " + value);
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>("123");
        Box<Integer> box1 = new Box<>(123);
        box.print();
        box1.print();
    }
}
