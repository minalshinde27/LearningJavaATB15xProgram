package Ex_14_CollectionFramework.Map;

import java.util.Hashtable;

public class Lab124_HashTable {
    public static void main() {

        //Hashtable K,V - Synchronised, Slow and Legacy Class - Thread Safe
        //null key and values not allowed
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        System.out.println(ht1);
    }
}
