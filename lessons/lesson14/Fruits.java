package lessons.lesson14;

public class Fruits {
    private String name;
    private int calories;

    public Fruits(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "n='" + name + '\'' +
                ", c=" + calories +
                '}';
    }
}
