package c_collection_framework;

import java.util.ArrayDeque;

public class f_arrayDeque {

  public static void main(String[] args) {
    // Create an ArrayDeque
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    // Add elements to both ends of the deque
    deque.addFirst(10); // Adds 10 at the front
    deque.addLast(20); // Adds 20 at the end
    deque.addFirst(5); // Adds 5 at the front
    deque.addLast(30); // Adds 30 at the end

    // Print the current state of the deque
    System.out.println("Deque: " + deque); // Output: [5, 10, 20, 30]

    // Remove and print elements from both ends
    System.out.println("Removed from front: " + deque.pollFirst()); // 5
    System.out.println("Removed from end: " + deque.pollLast()); // 30

    // Peek at the front and end elements
    System.out.println("First element: " + deque.peekFirst()); // 10
    System.out.println("Last element: " + deque.peekLast()); // 20

    // Print final state of the deque
    System.out.println("Final Deque: " + deque); // Output: [10, 20]
  }
}
