package lessons.lesson13;

import java.util.Comparator;

public class Cat implements Comparable<Cat>{
    @Override
    public int compareTo(Cat o) {
        return getNick().compareTo(o.getNick());
    }

    public enum Breed {
        ANGORA, BURMESE, SIBERIAN, SIAMESE, SPHINX
    }

    private Breed bread;
    private int age;
    private String  nick;

    public static Comparator<Cat> catAge= Comparator.comparing(Cat::getAge);


    public Cat(Breed bread, int age, String nick) {
        this.bread = bread;
        this.age = age;
        this.nick = nick;
    }

    public Breed getBread() {
        return bread;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "b=" + bread +
                ", a=" + age +
                ", n='" + nick + '\'' +
                '}';
    }
}
