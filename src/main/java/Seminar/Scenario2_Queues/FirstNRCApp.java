package Seminar.Scenario2_Queues;

import java.util.Scanner;

public class FirstNRCApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        FirstNRC finder = new FirstNRC();

        Character result = finder.findFirstNonRepeating(text);

        if (result == null) {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        input.close();
    }
}