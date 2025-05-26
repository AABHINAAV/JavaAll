package c_collection_framework.d_map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class c_treeMap {

  public static void main(String[] args) {
    // Create a TreeMap with Integer keys and String values
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    // Add key-value pairs to the TreeMap
    treeMap.put(3, "Three");
    treeMap.put(1, "One");
    treeMap.put(2, "Two");
    treeMap.put(4, "Four");

    // Print the TreeMap (keys will be sorted in ascending order)
    System.out.println("TreeMap (sorted by key): " + treeMap);

    // Retrieve a value based on a key
    System.out.println("Value for key 2: " + treeMap.get(2));

    // Remove a key-value pair
    treeMap.remove(3);

    System.out.println("containsKey : " + treeMap.containsKey(2));
    System.out.println("containsValue : " + treeMap.containsValue("abcd"));

    // Print the TreeMap after removing a key
    System.out.println("After removing key 3: " + treeMap);

    // Get the first and last key
    System.out.println("First key: " + treeMap.firstKey());
    System.out.println("Last key: " + treeMap.lastKey());

    System.out.println("size : " + treeMap.size());

    System.out.println("isEmpty : " + treeMap.isEmpty());

    Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
    for (Map.Entry<Integer, String> entry : entrySet) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    Set<Integer> keySet = treeMap.keySet();
    System.out.println("keySet : " + keySet);

    Collection<String> values = treeMap.values();
    System.out.println("values : " + values);
  }
}
