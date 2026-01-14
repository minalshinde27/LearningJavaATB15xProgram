package Ex_10_String;

public class Lab063_StringComparison {
    public static void main (String[] args){

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = "hello";
        //In SCP if value is same all objects point to same reference

        String s11 = new String("Hello");
        String s12 = new String("Hello");
        String s13 = new String("Hello");
        String s14 = new String("hello");
        //In OA though the valus is same each object point to individual reference. Always creates new reference.

        // == - checks the ref of String.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s4);

        System.out.println(s1 == s11);
        System.out.println(s12 == s14);
        System.out.println(s4 == s14);


        // equals - checks the content of String.
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));

        System.out.println(s1.equals(s11));
        System.out.println(s12.equals(s14));
        System.out.println(s4.equals(s14));

        System.out.println(s3.equalsIgnoreCase(s14));
    }
}
