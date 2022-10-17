package lessons.lesson13;

import java.util.*;

public class CatTester {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(
                Arrays.asList(
                        new Cat(Cat.Breed.BURMESE, 12, "Max"),
                        new Cat(Cat.Breed.BURMESE, 5, "Tickhon"),
                        new Cat(Cat.Breed.SIAMESE, 9, "Pushok"),
                        new Cat(Cat.Breed.SIBERIAN, 9, "Small"),
                        new Cat(Cat.Breed.ANGORA, 5, "Bird"),
                        new Cat(Cat.Breed.SIAMESE, 11, "Ball")
                )
        );

        cats.sort(
                Comparator
                        .comparing(Cat::getBread)
                        .thenComparing(Cat::getAge)
                        .thenComparing(Cat::getNick)
        );
        System.out.println(cats);

        Collections.sort(cats, Comparator.reverseOrder());
    }
}
