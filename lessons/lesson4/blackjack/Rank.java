package lessons.lesson4.blackjack;

public enum Rank {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
    NINE(9), TEN(10), JACK(2), QUEEN(3), KING(4), ACE(11);

    private int score;

    Rank(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
