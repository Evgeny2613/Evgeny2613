package lessons.lesson3.enumeration;

import java.util.Arrays;

public class EnumTester {
    public static void main(String[] args) {
        calcFruit(Fruits.KIWI);

        System.out.println(Fruits.APPLE.ordinal());

        Fruits [] f = {Fruits.KIWI, Fruits.APPLE};

        Fruits g = Fruits.valueOf("APPLE");

        System.out.println(Fruits.APPLE.getCalories());
        System.out.println(Arrays.toString(f));
    }

    public static int DEBUG = 1;
    public static void  calcFruit(Fruits f){
        switch (f) {
            case KIWI -> System.out.println("Kiwi here!");
            case ORANGE -> System.out.println("Orange here!");
            case BANANA -> System.out.println("Banana here!");
            case APPLE -> System.out.println("Apple here!");
        }
    }
}
