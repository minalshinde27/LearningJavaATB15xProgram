package Ex_14_CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab121_HashMap {
    public static void main() {

        Map<String,Integer> marks = new HashMap();
        // ⚠️ No guaranteed order!
        marks.put("Alice", 95);
        marks.put("Bob", 82);
        marks.put("Charlie", 90);
        marks.put("Dave", 78);
        System.out.println(marks);

        // Accessing
        System.out.println(marks.get("Alice"));
        System.out.println(marks.get("Dutta"));
        System.out.println(marks.getOrDefault("Pramod",0)); // 0 (key not found)

        // Update
        marks.put("Bob", 88);
        System.out.println(marks.get("Bob"));

        // Check
        System.out.println(marks.containsKey("Charlie"));
        System.out.println(marks.containsValue(100));

        // Size
        System.out.println(marks.size()); // 4

        // Remove
        marks.remove("Dave");

        System.out.println(marks);
    }
}
