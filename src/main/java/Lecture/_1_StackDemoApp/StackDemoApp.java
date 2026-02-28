package Lecture._1_StackDemoApp;

/* StackDemoApp.java
 * This application demonstrates how to use the built-in java.util.Stack class in Java.
 */

import java.util.Stack;   // Import Java's built-in Stack class

public class StackDemoApp {
    public static void main(String[] args) {
        // ---------------------------------------------------
        // 1. Create a Stack of Strings
        // ---------------------------------------------------
        Stack<String> myStack = new Stack<>();

        // ---------------------------------------------------
        // 2. Show initial state of the stack
        // ---------------------------------------------------
        System.out.println("\nShowing the initial stack:");

        System.out.println(myStack);  // Prints the stack contents

        // empty() checks whether the stack has no elements
        if (myStack.empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.printf("Stack contains %d entries\n", myStack.size());
        }

        // ---------------------------------------------------
        // 3. Add elements using push()
        // ---------------------------------------------------
        System.out.println("\nAdding Adrian, Belle and Charles");
        myStack.push("Adrian");   // Adrian is at the bottom (first added)
        myStack.push("Belle");    // Belle goes above Adrian
        myStack.push("Charles");  // Charles becomes the TOP element

        System.out.println(myStack);

        // empty() / size() checks status
        if (myStack.empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.printf("Stack contains %d entries\n", myStack.size());
        }

        // ---------------------------------------------------
        // 4. Remove element using pop()
        // Stack follows LIFO (Last In, First Out)
        // ---------------------------------------------------
        System.out.println("\nRemoving from the top of the stack");
        String removedItem = myStack.pop();  // Removes "Charles"
        System.out.println("Removed: " + removedItem);

        System.out.println(myStack);

        // empty() / size() checks status
        if (myStack.empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.printf("Stack contains %d entries\n", myStack.size());
        }


        // ---------------------------------------------------
        // 5. View element using peek()
        // ---------------------------------------------------
        System.out.println("\nReading the element at the top of the stack");
        String topItem = myStack.peek();  // Should return "Belle"
        System.out.println("Top element (without removing): " + topItem);

        System.out.println(myStack);  // Stack remains unchanged

        // empty() / size() checks status
        if (myStack.empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.printf("Stack contains %d entries\n", myStack.size());
        }

        // ---------------------------------------------------
        // 6. Clear the stack
        // ---------------------------------------------------
        System.out.println("\nClearing the stack");
        myStack.clear();

        System.out.println(myStack);

        // empty() / size() checks status
        if (myStack.empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.printf("Stack contains %d entries\n", myStack.size());
        }
    }
}
