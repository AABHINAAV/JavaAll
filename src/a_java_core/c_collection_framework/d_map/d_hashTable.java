package c_collection_framework.d_map;

import java.util.Hashtable;

public class d_hashTable {

  public static void main(String[] args) {
    Hashtable<String, Integer> hashtable = new Hashtable<>();
    hashtable.put("apple", 1);
    hashtable.put("mango", 2);
    hashtable.put("banana", 3);

    hashtable.get("banana");
  }
}
