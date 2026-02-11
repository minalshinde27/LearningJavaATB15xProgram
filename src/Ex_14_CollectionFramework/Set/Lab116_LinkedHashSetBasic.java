package Ex_14_CollectionFramework.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab116_LinkedHashSetBasic {
    public static void main() {
        Set lhs = new LinkedHashSet();
        // LinkedHashSet mechanism to store the element,
        // order will maintain, no duplicates
        // Single 'null' allowed

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("waterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

    }
}
