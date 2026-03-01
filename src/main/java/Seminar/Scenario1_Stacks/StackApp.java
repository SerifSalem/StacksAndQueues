package Seminar.Scenario1_Stacks;

import java.util.Scanner;

// Main program to test string reversal and palindrome check using a Stack.
public class StackApp {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        // Create Stacks object
        Stacks tool = new Stacks();

        // Reverse the string using the stack
        String reversed = tool.reverse(input);

        // Display results
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        // Palindrome check - Simple comparison (case-sensitive, includes spaces)
        if (input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome");
        }

        in.close();        // Close Scanner
    }
}


