package Seminar.Scenario1_Stacks;

import java.util.Scanner;

// StackApp - Application class for user interaction
public class StackApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = input.nextLine();

        Stacks tool = new Stacks();

        String reversed = tool.reverseString(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);

        if (tool.isPalindrome(original)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

        input.close();
    }
}