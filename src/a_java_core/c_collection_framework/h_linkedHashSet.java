package c_collection_framework;

import java.util.LinkedHashSet;

public class h_linkedHashSet {

  public static void main(String[] args) {
    // Create a LinkedHashSet of Strings
    LinkedHashSet<String> set = new LinkedHashSet<>();

    // Add elements to the LinkedHashSet
    set.add("Apple");
    set.add("Banana");
    set.add("Orange");
    set.add(null);

    // Add a duplicate element (will not be added)
    boolean added = set.add("Apple"); // Returns false because "Apple" is already in the set
    System.out.println("Apple added again: " + added); // Output: false

    // Check if an element is in the set
    boolean containsApple = set.contains("Apple"); // Returns true
    System.out.println("Contains Apple: " + containsApple); // Output: true

    // Remove an element from the set
    set.remove("Banana");
    System.out.println("After removal: " + set); // Output: [Apple, Orange]

    // Get the size of the set
    System.out.println("Size of set: " + set.size()); // Output: 2

    // Check if the set is empty
    System.out.println("Is set empty? " + set.isEmpty()); // Output: false

    // Clear all elements from the set
    set.clear();
    System.out.println("Set after clear: " + set); // Output: []
  }
}
