package Ex_14_CollectionFramework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab125_MapBasicOperations {
    public static void main() {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("IN", "India");
        map.put("US", "United States");
        map.put("UK", "United Kingdom");
        map.put("JP", "Japan");
        System.out.println(map);

        // Basic operations
        map.put("VT", "Vietnam");           // Add/update key-value pair
        map.get("US");                  // Retrieve value by key
        map.containsKey("JP") ;         // Check if key exists
        map.containsValue("India") ;     // Check if value exists
        map.remove("US");               // Remove entry by key
        map.size();                    // Get number of entries
        map.isEmpty();                 // Check if map is empty
        // map.clear();                // Remove all entries

// Advanced operations
        map.putIfAbsent("MY", "Malaysia");   // Add only if key doesn't exist
        map.replace("UK", "London");    // Replace value for existing key
        map.getOrDefault("CN", "China"); // Get value or default


// Using entrySet() - Most efficient for key-value access
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
        }


// Using keySet() - When you need keys and may access values
        for (String key : map.keySet()) {
            String value = map.get(key);
        }

// Using values() - When you only need values
        for (String value : map.values()) {
            System.out.println(value);        }

// Using forEach (Java 8+)
        map.forEach((key, value) -> {
            // Process key-value pair
        });

// initialCapacity -> 10
// 20 -> Load Factor * new value = Total Capacity -> Hashmap -> increased.
        Map<String,String> map1 = new HashMap(10);


    }
}
