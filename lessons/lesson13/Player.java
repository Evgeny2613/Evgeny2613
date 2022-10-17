package lessons.lesson13;

import java.util.Comparator;

public class Player implements Comparable<Player> {
    private int rating;
    private String name;
    private int age;

    public Player(int rating, String name, int age) {
        this.rating = rating;
        this.name = name;
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static Comparator<Player> ageComparator = Comparator.comparing(Player::getAge);

    @Override
    public int compareTo(Player o) {
      //  return this.getRating() - o.getRating();
        return Integer.compare(this.getRating(), o.getRating());
    }

    @Override
    public String toString() {
        return "Player{" +
                "r=" + rating +
                ", n='" + name + '\'' +
                ", a=" + age +
                '}';
    }
}
