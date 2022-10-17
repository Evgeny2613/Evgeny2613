package lessons.lesson13;

import java.util.*;

public class Lesson13 {
    public static void main(String[] args) {
        // Comparable<T> -интерфейс реализует класс
        // Comparator<T> - интерфейс который можно реализовать за пределами класса, который можно передать в функцию сортировки
        List<String> groups = new ArrayList<>(Arrays.asList("Guns and Roses", "Aerosmith", "Beatles", "Real Jam", "Cranberries"));
        System.out.println(groups);
        Collections.sort(groups);
        System.out.println(groups);
        Collections.sort(groups, Comparator.reverseOrder());
        System.out.println(groups);


        int[] marks = {1, 3, 4, 5, 2};
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

        List<Player> team = new ArrayList<>(
                Arrays.asList(
                        new Player(14, "Sam", 24),
                        new Player(16, "Alesander", 27),
                        new Player(10, "John", 24),
                        new Player(16, "Sam", 19),
                        new Player(12, "Sam", 19)));

        Collections.sort(team);
        System.out.println(team);

        Comparator<Player> nameComparator = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(team, nameComparator);
        System.out.println(team);

//        Comparator<Player> ageComparator = new Comparator<Player>() {
//            @Override
//            public int compare(Player o1, Player o2) {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        };

//        Comparator<Player> ageComparator = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());

        Comparator<Player> ageComparator = Comparator.comparingInt(Player::getAge);

        Collections.sort(team, ageComparator);
        System.out.println(team);


        team.sort(
                (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())
        );

//        team.sort(
//                Comparator.comparing(new Function<Player, Integer>() {
//                    @Override
//                    public Integer apply(Player player) {
//                        return player.getAge();
//                    }
//                })
//        );

//        team.sort(
//                Comparator.comparing(player -> player.getAge())
//        );

        team.sort(
                Comparator.comparing(Player::getAge)
                        .reversed()
                        .thenComparing(Player::getName)
        );

        team.sort(
                Comparator.comparing(Player::getRating)
                        .thenComparing(Player::getAge)
                        .reversed()
                        .thenComparing(Player::getName)

        );

        System.out.println(team);

        team.sort(Player.ageComparator);
    }
}