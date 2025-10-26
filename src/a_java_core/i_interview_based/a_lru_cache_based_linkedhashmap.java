package a_java_core.i_interview_based;

import java.util.LinkedHashMap;
import java.util.Map;

public class a_lru_cache_based_linkedhashmap {

  static class LruCacheLinkedHashmap<K, V> extends LinkedHashMap<K, V> {

    public int capacity;

    LruCacheLinkedHashmap(int capacity) {
      super(capacity, 0.75f, true);
      this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
      return size() > capacity; // Remove oldest when limit reached
    }
  }

  public static void main(String[] args) {
    LruCacheLinkedHashmap<Integer, String> map = new LruCacheLinkedHashmap<>(3);
    map.put(1, "One");
    map.put(2, "Two");
    map.put(3, "Three");
    map.put(4, "Four"); // This will evict key 1
    System.out.println(map); // Output: {2=Two, 3=Three, 4=Four}

    System.out.println(map.get(2));

    map.put(5, "Five"); // This will evict key 3
    System.out.println(map); // Output: {4=Four, 2=Two, 5=Five}
  }
}
