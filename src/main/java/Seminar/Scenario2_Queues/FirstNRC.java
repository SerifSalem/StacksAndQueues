package Seminar.Scenario2_Queues;

import java.util.LinkedList;
import java.util.Collections;

// FirstNRC - Uses LinkedList and Collections.frequency()
public class FirstNRC {
    public Character findFirstNonRepeating(String text) {

        // Store characters in a LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // toCharArray() converts the string into an array of characters
        for (char ch : text.toCharArray()) {list.add(ch);}

        // Check each character in order
        for (Character ch : list) {
            // Count how many times this character appears
            if (Collections.frequency(list, ch) == 1) {
                return ch;}   // First non-repeating character
        }
        // If none found
        return null;
    }
}

