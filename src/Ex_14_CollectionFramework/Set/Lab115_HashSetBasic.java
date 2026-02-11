package Ex_14_CollectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab115_HashSetBasic {
    public static void main() {

        //In HashSet, elements are stored in random order depending on its hash value
        //Single 'null' allowed
        Set<Integer> set = new HashSet();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set elements: " + set);


        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------");

        Set<String> hs = new HashSet();
        hs.add("apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add("waterMelon");
        hs.add(null);
        hs.add(null);
        //hs.add(123);
        System.out.println(hs);
    }
}
