package _4_CarGameApp;

import java.util.ArrayList;
import java.util.Collections;

// Deck - Represents a full pack of 52 cards (Stores Card objects in an ArrayList)
public class Deck {
    private ArrayList<Card> deck;       // List holding the cards in the deck

    // The constructor for Deck() - Creates a full deck by generating all combinations:
    // 13 ranks × 4 suits = 52 cards.
    public Deck() {
        deck = new ArrayList<>();       // suit = 0..3, rank = 0..12
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // shuffle() - Randomises the order of cards in the deck.
    public void shuffle() {Collections.shuffle(deck);}

    // deal() - Removes and returns the "top" card from the deck.
    public Card deal() {
        if (deck.size() > 0) {
            return deck.remove(0);
        }
        return null;
    }

    // toString() - Returns the full deck as a string (one card per line).
    @Override
    public String toString() {
        String result = "";
        for (Card c : deck) {
            result += c + "\n";
        }
        return result;
    }
}

