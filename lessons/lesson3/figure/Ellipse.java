package lessons.lesson3.figure;

public class Ellipse extends FigureAbstract{
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        return 4 * (Math.PI * (a + b) + (a - b) * (a - b))/(a + b);
    }
}
