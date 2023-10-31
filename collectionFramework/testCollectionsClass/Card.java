package testCollectionsClass;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit s, String face, int rank) {
    @Override
    public String toString() {
        return "%s%c(%d)".formatted(face, s.getImage(), rank);
    }

    public static Card getNumericCard(Suit s, int num) {
        if (num < 2 || num > 10) {
            System.out.println("Invalid Numeric card selected");
            return null;
        }
        return new Card(s, String.valueOf(num), num - 2);
    }

    public static Card getFaceCard(Suit s, char face) {
        int index = "JQKA".indexOf(face);
        if (index < 0) {
            System.out.println("Invalid face card selected!");
            return null;
        }

        return new Card(s, "" + face, index + 9);
    }

    public static List<Card> getStandardDeck() {
        List<Card> deck = new ArrayList<>(52);
        for (Suit s : Suit.values()) {
            for (int i = 2; i <= 10; i++) {
                deck.add(Card.getNumericCard(s, i));
            }
            for (char c : new char[] { 'J', 'Q', 'K', 'A' }) {
                deck.add(Card.getFaceCard(s, c));
            }
        }

        return deck;
    }

    public static void printDeck(List<Card> deck, String description, int rows) {
        System.out.println("-".repeat(30));
        if (description != null)
            System.out.println(description);
        int cardInRows = deck.size() / rows;

        for (int i = 0; i < rows; i++) {
            int startIdx = i * cardInRows;
            int endIdx = startIdx + cardInRows;
            deck.subList(startIdx, endIdx).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Current deck", 4);
    }
}
