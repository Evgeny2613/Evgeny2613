package lessons.lesson29;

public class Calculator {
    public Number multiply(Number f, Number l) {
        return f.doubleValue() * l.doubleValue();
    }

    public Number add(Number f, Number l) {
        return f.doubleValue() + l.doubleValue();
    }

    public Number divide(Number f, Number l) {
        if (l.doubleValue() == 0.0)
            throw new ArithmeticException("Division by zero");
        return f.doubleValue() / l.doubleValue();
    }
}
