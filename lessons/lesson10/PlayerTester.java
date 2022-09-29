package lessons.lesson10;

import java.util.*;

public class PlayerTester {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>(List.of(
                new Player(11, "Mike"),
                new Player(12, "Masha"),
                new Player(11, "Galina")
        ));

        System.out.println(players.size());

        // System.out.println(players);

        // for (Player p: players)
        //   System.out.println(p);

        Iterator<Player> playerIterator = players.iterator();
        while (playerIterator.hasNext())
            System.out.println("From iterator: " + playerIterator.next());

        ArrayList<Player> playerArrayList = new ArrayList<>(players);
        System.out.println(playerArrayList);

        players.add(new Player(15, "Alexander"));
        players.add(new Player(1, "Natasha"));
        players.add(new Player(101, "Alexander"));
        System.out.println(players);

       /* Iterator<Player> playerIterator1 = players.iterator();
        while (playerIterator1.hasNext()) {
            Player p = playerIterator1.next();
             if (p.getName().equals("Alexander"))
                 playerIterator1.remove();
        }
        System.out.println(players);

        */

        Set<String> capitals = new HashSet<>(List.of("Dublin", "Oslo", "Stockholm", "Tallinn", "Riga"));

        TreeSet<String> tCapitals = new TreeSet<>(capitals);
        System.out.println(tCapitals);

        System.out.println(tCapitals.tailSet("Munich")); // все что дальше Мюнхина
        System.out.println(tCapitals.subSet("Barcelona", "Rome")); // елементы что были бы между Барсой и Римом

        TreeSet<Player> pl = new TreeSet<>(
                new Comparator<Player>() {
                    @Override
                    public int compare(Player o1, Player o2) {
                        return Integer.compare(o1.getId(), o2.getId());
                    }
                }
        );
        pl.add(new Player(14, "Max"));
        pl.add(new Player(2, "Catherine"));
        System.out.println(pl);
    }
}
