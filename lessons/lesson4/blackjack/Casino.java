package lessons.lesson4.blackjack;

import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        do {
            Card card = dealer.getCard();
            score += card.getScore();
            System.out.println("Card: " + card);
            System.out.println("Score is: " + score);
            System.out.println("Press N for end the game");
        } while (!scanner.next().equals("N"));
    }
}
