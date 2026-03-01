package Seminar.Scenario1_Stacks;

import java.util.Stack;

/* Stacks - This class demonstrates how a Stack can be used
 * to reverse a string using LIFO (Last In First Out). */
public class Stacks {
    private Stack<Character> stack;        // Stack used internally to store characters

    // Constructor - Creates an empty stack
    public Stacks() {
        stack = new Stack<>();
    }

    /* reverse(String text) - Pushes each character of the input string onto the stack.
     * Then pops them off to build the reversed string. */
    public String reverse(String text) {
        stack.clear();                       // Clear stack in case the method is reused
        for (char ch : text.toCharArray()) { // Push each character onto the stack
            stack.push(ch);
        }

        // Build reversed string by popping characters (LIFO)
        StringBuilder reversed = new StringBuilder();
        while (!stack.empty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
