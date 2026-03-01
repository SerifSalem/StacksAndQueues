package _4_CarGameApp;

// CardTest -  Creates two random Card objects and prints them biggest first.
public class CardTest {

    public static void main(String[] args) {

        // Create two random cards
        Card c1 = new Card(); Card c2 = new Card();

        // Display the generated cards
        System.out.println("Card 1: " + c1);
        System.out.println("Card 2: " + c2);

        // Display the cards biggest first (based on rank only)
        System.out.println("\nBiggest first:");

        if (c1.isBiggerThan(c2)) {
            System.out.println(c1);
            System.out.println(c2);
        } else if (c2.isBiggerThan(c1)) {
            System.out.println(c2);
            System.out.println(c1);
        } else {
            // If ranks are equal, show both and state same rank
            System.out.println(c1 + " (same rank)");
            System.out.println(c2 + " (same rank)");
        }
    }
}