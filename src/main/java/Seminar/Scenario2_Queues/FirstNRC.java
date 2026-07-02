package Seminar.Scenario2_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNRC {

    public Character findFirstNonRepeating(String text) {

        Queue<Character> queue = new LinkedList<>();

        int[] count = new int[256];

        // Add characters to queue and count them
        for (char ch : text.toCharArray()) {
            queue.add(ch);
            count[ch]++;
        }

        // Remove characters one by one from the queue
        while (!queue.isEmpty()) {
            char currentChar = queue.remove();

            if (count[currentChar] == 1) {
                return currentChar;
            }
        }

        return null;
    }
}

