package Ex_14_CollectionFramework.Generic;

public class Lab104_Sample {
    public static void main() {
        add("Test", 3, true);
    }

    static <G> G add(G a, G b, G c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return null;
    }
}
