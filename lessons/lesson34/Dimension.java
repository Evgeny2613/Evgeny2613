package lessons.lesson34;

public class Dimension<T extends Number> {
    private T length;
    private T height;
    private T depth;

    public Dimension(T length, T height, T depth) {
        this.length = length;
        this.height = height;
        this.depth = depth;
    }

    public Double volume() {
        return length.doubleValue() * height.doubleValue() * depth.doubleValue();
    }

    public T getLength() {
        return length;
    }

    public T getHeight() {
        return height;
    }

    public T getDepth() {
        return depth;
    }

    public static void main(String[] args) {
        Dimension<Integer> dimension = new Dimension<>(1, 2, 3);
        System.out.println(dimension.volume());
    }

}
