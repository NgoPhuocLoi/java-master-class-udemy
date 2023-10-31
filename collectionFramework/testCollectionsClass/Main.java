package testCollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Card aceOfHeart = Card.getFaceCard(Suit.HEART, 'A');
        List<Card> cards = new ArrayList<>(52);
        System.out.println("cards size: " + cards.size());
        Collections.fill(cards, aceOfHeart);

        System.out.println("cards after using Collections.fill: " + cards);

        List<Card> aceOfHearts = Collections.nCopies(10, aceOfHeart);
        System.out.println("aceOfHearts after using Collections.nCopy: " + aceOfHearts);

        List<Card> kingOfClubs = Collections.nCopies(10, Card.getFaceCard(Suit.CLUB, 'K'));
        Card.printDeck(kingOfClubs);

        Card[] cardArray = new Card[12];
        Arrays.fill(cardArray, Card.getFaceCard(Suit.HEART, 'A'));
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Deck of cards after using Collections.addAll", 4);

        Collections.copy(cards, kingOfClubs);
        Card.printDeck(cards, "cards after copying kingOfClubs", 2);

        List<Card> immutableCard = List.copyOf(kingOfClubs);
        Card.printDeck(immutableCard, "Immutable kingOfClubs using List.copyOf", 2);
        // immutableCard.set(2, aceOfHeart); can not set

    }
}
