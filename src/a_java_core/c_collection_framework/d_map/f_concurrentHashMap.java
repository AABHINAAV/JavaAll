package c_collection_framework.d_map;

import java.util.concurrent.ConcurrentHashMap;

public class f_concurrentHashMap {

  public static void main(String[] args) {
    ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    map.put("A", 1); // Add key-value pair
    Integer value = map.get("A"); // Retrieve value
  }
}
