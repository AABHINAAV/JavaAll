package c_collection_framework.a_list;

import java.util.LinkedList;

public class b_linkedList {

  public static void main(String[] args) {
    // Creating a LinkedList of Integer type
    LinkedList<Integer> list = new LinkedList<>();

    // Adding elements to the LinkedList
    list.add(10); // Adds 10 to the end of the list
    list.add(20); // Adds 20 to the end of the list
    list.add(30); // Adds 30 to the end of the list

    // Accessing elements
    System.out.println("First Element: " + list.getFirst()); // 10
    System.out.println("Last Element: " + list.getLast()); // 30

    // Adding elements at the beginning and end
    list.addFirst(5); // Adds 5 at the beginning
    list.addLast(40); // Adds 40 at the end
    System.out.println("After adding at first and last: " + list);

    // Removing elements
    list.removeFirst(); // Removes 5 (first element)
    list.removeLast(); // Removes 40 (last element)
    System.out.println("After removing first and last: " + list);

    // Size of the LinkedList
    System.out.println("Size of list: " + list.size()); // 3

    // Checking if the list contains an element
    System.out.println("Contains 20: " + list.contains(20)); // true
    System.out.println("Contains 40: " + list.contains(40)); // false

    // Iterating through the LinkedList
    System.out.println("Iterating through the list:");
    for (Integer value : list) {
      System.out.println(value); // 10, 20, 30
    }

    // Getting an element at a specific index
    System.out.println("Element at index 1: " + list.get(1)); // 20

    // Removing an element by index
    list.remove(0); // Removes the element at index 0 (which is 10)
    System.out.println("After removing element at index 0: " + list);
  }
}
