package c_collection_framework.d_map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class b_linkedHashMap {

  public static void main(String[] args) {
    // Create a LinkedHashMap with insertion order
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

    // Adding key-value pairs to the map
    map.put("John", 25);
    map.put("Jane", 30);
    map.put("Tom", 35);
    map.put("Lucy", 28);

    // Access some elements
    map.get("Jane");
    map.get("Tom");

    System.out.println("containsKey : " + map.containsKey("apple"));
    System.out.println("containsValue : " + map.containsValue(30));

    map.remove("Jane");
    System.out.println("after removing jane : " + map);

    System.out.println("Size : " + map.size());

    System.out.println("isEmpty : " + map.isEmpty());

    // Iterating over the LinkedHashMap (Insertion Order)
    System.out.println("Insertion Order:");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    Set<String> keySet = map.keySet();
    System.out.println("keySet : " + keySet);

    Collection<Integer> values = map.values();
    System.out.println("values : " + values);

    map.clear();
  }
}
