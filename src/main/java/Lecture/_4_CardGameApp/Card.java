package Lecture._4_CardGameApp;

import java.util.Random;

// Card - Represents a single standard playing card (A card has a rank and a suit)
public class Card {
    // Allowed ranks in increasing order (index = strength)
    private static final String[] RANKS = {
            "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    // Allowed suits
    private static final String[] SUITS = {"Clubs","Diamonds","Hearts","Spades"};

    // One Random object reused for all cards (Used by deafult costructor)
    private static final Random RAND = new Random();

    // Card fields
    private String rank;
    private String suit;

    // Card() - Default constructor that creates a random card.
    public Card() {
        this.rank = RANKS[RAND.nextInt(RANKS.length)];
        this.suit = SUITS[RAND.nextInt(SUITS.length)];
    }

    // Overloaded constructor to creat specific card (used to creat full Deck).
    public Card(int rankIndex, int suitIndex) {
        this.rank = RANKS[rankIndex];
        this.suit = SUITS[suitIndex];
    }

    // getRank() - Returns the rank of the card.
    public String getRank() {
        return rank;
    }

    // getSuit() - Returns the suit of the card.
    public String getSuit() {
        return suit;
    }

    // isBiggerThan(Card other)
    // Returns true if this card has a higher rank than the other card.
    public boolean isBiggerThan(Card other) {
        return rankValue(this.rank) > rankValue(other.rank);
    }

    // rankValue(String r) - Helper method:
    // Converts a rank into its numeric strength using the RANKS array index.
    private int rankValue(String r) {
        for (int i = 0; i < RANKS.length; i++) {
            if (RANKS[i].equals(r)) {
                return i; // smaller index = lower rank, larger index = higher rank
            }
        }
        return -1; // should not happen if ranks are always taken from RANKS
    }

    // toString()
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

