package Seminar.Scenario1_Stacks;

import java.util.Stack;

// Stacks - Logic class for reversing a string and checking palindrome
public class Stacks {

    public String reverseString(String original) {

        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        String reversed = "";

        // Pop each character from the stack to build the reversed string
        while (!stack.empty()) {
            reversed = reversed + stack.pop();
        }

        return reversed;
    }

    public boolean isPalindrome(String original) {

        String reversed = reverseString(original);

        return original.equals(reversed);
    }
}