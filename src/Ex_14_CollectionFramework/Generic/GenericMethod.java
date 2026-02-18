package Ex_14_CollectionFramework.Generic;

import java.util.Comparator;

public class GenericMethod {
    public static void main() {
        System.out.println(maximumOf(2,5,3));
        System.out.println(maximumOf(3.2, 4.6, 1.2));
        System.out.println(maximumOf("test", "3", "4.5"));
    }

    public static <T extends Comparable <T>> T maximumOf(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
