package Lecture._2_QueueDemoApp;

/* QueueDemoApp.java
 * This program demonstrates how to use the built-in
 * Java Queue interface using LinkedList as its implementation.
 */

import java.util.LinkedList;  // LinkedList is used to implement Queue
import java.util.Queue;       // Import Queue interface

public class QueueDemoApp {

    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------
        // 1. Create a Queue of Strings using Queue interface and LinkedList implementation
        // ---------------------------------------------------------------------------------
        Queue<String> myQueue = new LinkedList<>();

        // ---------------------------------------------------
        // 2. Show initial state of the queue
        // ---------------------------------------------------
        System.out.println("\nShowing the initial queue:");
        System.out.println(myQueue);

        // isEmpty() checks whether the queue has no elements
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.printf("Queue contains %d elements\n", myQueue.size());
        }

        // ---------------------------------------------------
        // 3. Add elements to the queue
        // ---------------------------------------------------
        System.out.println("\nAdding Adrian, Belle and Charles");
        myQueue.add("Adrian");    // First element added (front)
        myQueue.add("Belle");     // Added behind Adrian
        myQueue.add("Charles");   // Added at the rear

        System.out.println(myQueue);

        // isEmpty() / size() checks status
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.printf("Queue contains %d elements\n", myQueue.size());
        }

        // ---------------------------------------------------
        // 4. Remove element from the queue
        // FIFO: First element added is the first removed
        // ---------------------------------------------------
        System.out.println("\nRemoving from the front of the queue");
        String removedItem = myQueue.remove();  // Removes "Adrian"
        System.out.println("Removed: " + removedItem);

        System.out.println(myQueue);

        // isEmpty() / size() checks status
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.printf("Queue contains %d elements\n", myQueue.size());
        }

        // ---------------------------------------------------
        // 5. View the front element using peek()
        // ---------------------------------------------------
        System.out.println("\nReading the element at the front of the queue");
        String frontItem = myQueue.peek();  // Should return "Belle"
        System.out.println("Front element (without removing): " + frontItem);

        System.out.println(myQueue);  // Queue remains unchanged

        // isEmpty() / size() checks status
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.printf("Queue contains %d elements\n", myQueue.size());
        }

        // ---------------------------------------------------
        // 6. Clear the queue to removes all elements from the queue
        // ---------------------------------------------------
        System.out.println("\nClearing the queue");
        myQueue.clear();

        System.out.println(myQueue);

        // isEmpty() / size() checks status
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.printf("Queue contains %d elements\n", myQueue.size());
        }
    }
}
