package c_collection_framework.d_map;

import java.util.HashMap;
import java.util.Map;

public class a_hashMap {

  public static void main(String[] args) {
    // Create a HashMap
    Map<String, Integer> map = new HashMap<>();

    // Add some key-value pairs
    map.put("John", 25);
    map.put("Jane", 30);
    map.put("Tom", 35);
    map.put("Lucy", 28);

    // Retrieve a value using a key
    System.out.println("John's age: " + map.get("John")); // Output: 25

    // Check if a key exists
    System.out.println("Is John in the map? " + map.containsKey("John")); // Output: true

    // Check if a value exists
    System.out.println("Is there someone aged 30? " + map.containsValue(30)); // Output: true

    // Remove a key-value pair
    map.remove("Lucy");

    // Display all key-value pairs
    System.out.println("Updated map: " + map); // Output: {Tom=35, John=25, Jane=30}

    // Get the size of the map
    System.out.println("Size of the map: " + map.size()); // Output: 3

    // Iterate over the keys using keySet()
    System.out.println("Keys: ");
    for (String key : map.keySet()) {
      System.out.println(key);
    }

    // Iterate over the key-value pairs using entrySet()
    System.out.println("Key-Value pairs: ");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    // interface Map<K, V> {
    //     interface Entry<K, V> {
    //     }
    // }

    // Clear all entries from the map
    map.clear();
    System.out.println("Map after clearing: " + map); // Output: {}
  }
}
