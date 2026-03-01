package Seminar.Scenario2_Queues;

import java.util.Scanner;

// FirstNRCApp - Handles user interaction and calls the logic class.
public class FirstNRCApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        // Create logic object
        FirstNRC tool = new FirstNRC();

        // Call method
        Character result = tool.findFirstNonRepeating(input);

        // Display result
        if (result == null) {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        in.close();
    }
}
