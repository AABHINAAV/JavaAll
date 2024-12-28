package c_collection_framework;

import java.util.PriorityQueue;

public class e_priorityQueue {

  public static void main(String[] args) {
    // Create a PriorityQueue with natural ordering (ascending for Integers)
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    // Create a PriorityQueue with custom comparator (descending order)
    // PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

    // Adding elements to the PriorityQueue
    queue.offer(30);
    queue.offer(10);
    queue.offer(20);
    queue.offer(40);

    // Printing the PriorityQueue (it will display in order of priority)
    System.out.println("PriorityQueue (ascending order): " + queue);

    // showing element with highest pirority
    System.out.println("highest priority element : " + queue.peek());

    // Polling elements from the PriorityQueue (will remove the lowest element first)
    while (!queue.isEmpty()) {
      System.out.println("Polled: " + queue.poll());
    }
  }
}
