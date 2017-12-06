package labwork2134.com.brainacad.oop.testenum2;

public class Main {
    public static void main(String[] args) {
        Suit[] arrayOfSuit = Suit.values();
        Rank[] arrayOfRank = Rank.values();
        Suit currentSuit;
        Rank currentRank;
        Card[][] deck = new Card[arrayOfSuit.length][arrayOfRank.length];
        for (int suit = 0; suit < deck.length; suit++) {
            currentSuit = arrayOfSuit[suit];
            for (int rank = 0; rank < arrayOfRank.length; rank++) {
                currentRank = arrayOfRank[rank];
                deck[suit][rank] = new Card(currentSuit, currentRank);
            }
        }
        for (Card[] arrayOfOneSuit : deck) {
            for (Card card : arrayOfOneSuit) {
                System.out.println(card);
            }
        }
    }
}
