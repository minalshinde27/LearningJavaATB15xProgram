package Ex_14_CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class Lab117_TreeSetBasic {
    public static void main() {
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.
        // Duplicates and 'null' not allowed
        // Single datatype allowed due to default sorting nature
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
        System.out.println(ts);
        //ts.add(123);
        //ts.add(null);

    }
}
