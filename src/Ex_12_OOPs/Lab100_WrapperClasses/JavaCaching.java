package Ex_12_OOPs.Lab100_WrapperClasses;

public class JavaCaching {
    public static void main() {

        Integer a = 127;
        Integer b = 127;
        System.out.println(a==b);   //true (Cached)

        Integer c = 128;
        Integer d = 128;
        System.out.println(c==d);   //false (Not cached)

        /*
        Java caches Integer values from -128 to 127,
        so `==` works for small numbers but fails for larger ones.
        Always use `.equals()` for wrapper comparisons.
         */

        System.out.println(c.equals(d));
    }
}
