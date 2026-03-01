package _4_CarGameApp;

/* CardTestDeck - Demonstrates creating a deck, shuffling, dealing cards,
 * and printing the remaining deck. */
public class DeckTest {

    public static void main(String[] args) {

        // Create a new deck (in ordered form initially)
        Deck deck = new Deck();

        System.out.println("Full deck:");
        System.out.println(deck);

        // Shuffle the deck and print again to show the order changed
        deck.shuffle();
        System.out.println("Shuffled deck:");
        System.out.println(deck);

        // Deal and print 5 cards
        System.out.println("Dealt cards:");
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());

        // Print the remaining deck after dealing
        System.out.println();
        System.out.println("Remaining deck:");
        System.out.println(deck);
    }
}

