package c_collection_framework.a_list;

import java.util.Vector;

public class c_vector {

  public static void main(String[] args) {
    // Create a Vector to store Integer values
    Vector<Integer> vector = new Vector<>();

    // Adding elements to the Vector
    vector.add(10);
    vector.add(20);
    vector.add(30);

    vector.add(2, 40);

    // Print the Vector
    System.out.println("Vector: " + vector);

    // Accessing an element by index
    System.out.println("Element at index 1: " + vector.get(1)); // 20

    System.out.println("first element : " + vector.firstElement());
    System.out.println("last element : " + vector.lastElement());

    vector.set(1, 50);

    // Removing an element by index
    vector.remove(0); // Removes the element at index 0 (10)
    System.out.println("After removing element at index 0: " + vector);

    // Size of the Vector
    System.out.println("Size of the Vector: " + vector.size());

    //  the number of elements the vector can hold before resizing
    System.out.println("Capacity of the Vector: " + vector.capacity());

    // Checking if the Vector is empty
    System.out.println("Is the Vector empty? " + vector.isEmpty());
  }
}
