package c_collection_framework.d_map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class e_synchronizedMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("mango", 2);

        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(hashMap);
    }
}
