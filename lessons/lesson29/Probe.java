package lessons.lesson29;

import Homework.hw23.Addition4.Car;

public class Probe {
    public static Object getCar() {
        return new Car("BMW","M5", 10.5, 600);
    }

    public static String getMessage(int i) {
        return i > 5 ? "Hello" : "World";
    }
}
