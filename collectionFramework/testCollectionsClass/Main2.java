package testCollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed deck", 4);

        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled deck", 4);

        var sortAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::s);
        Collections.sort(deck, sortAlgorithm);
        Card.printDeck(deck, "Sorted by rank. suit", 4);

        List<Card> threes = new ArrayList<>(deck.subList(4, 8));
        List<Card> sixs = new ArrayList<>(deck.subList(16, 20));

        Card.printDeck(threes, "Threes in deck", 1);
        Card.printDeck(sixs, "Sixs in deck", 1);

        System.out.println("Index of thress in deck: " + Collections.indexOfSubList(deck, threes));

        System.out.println("Disjoin(threes, deck) = " + Collections.disjoint(deck, threes));
        System.out.println("Disjoin(threes, sixs) = " + Collections.disjoint(threes, sixs));
    }
}
