package c_collection_framework;

import java.util.TreeSet;

public class i_treeSet {

  public static void main(String[] args) {
    // Create a TreeSet with natural order (ascending order)
    TreeSet<Integer> set = new TreeSet<>();

    // Add elements to the TreeSet
    set.add(10);
    set.add(5);
    set.add(20);
    set.add(15);

    // Display the TreeSet (elements are sorted)
    System.out.println("TreeSet: " + set); // Output: [5, 10, 15, 20]

    // Get the first element (smallest)
    System.out.println("First element: " + set.first()); // Output: 5

    // Get the last element (largest)
    System.out.println("Last element: " + set.last()); // Output: 20

    // Remove an element
    set.remove(15);
    System.out.println("After removal: " + set); // Output: [5, 10, 20]

    // Poll the first element (removes and returns it)
    System.out.println("Poll First: " + set.pollFirst()); // Output: 5
    System.out.println("TreeSet after pollFirst: " + set); // Output: [10, 20]

    // Poll the last element (removes and returns it)
    System.out.println("Poll Last: " + set.pollLast()); // Output: 20
    System.out.println("TreeSet after pollLast: " + set); // Output: [10]
  }
}
