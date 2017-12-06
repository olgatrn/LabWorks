package labwork2134.com.brainacad.oop.testenum2;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "The Card: " +
                cardSuit +
                "_" + cardRank;
    }
}
