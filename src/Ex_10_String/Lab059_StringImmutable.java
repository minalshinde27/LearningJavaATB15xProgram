package Ex_10_String;

public class Lab059_StringImmutable {
    public static void main (String[] args){

        String s1 = "Hello";
        s1 = s1.concat("World");

        System.out.println(s1);

        /*
        String is immutable, it means that once a String object is created,
        its value cannot be changed. If you try to "modify" it,
        the system actually creates a brand new String object in memory.
         */
    }
}
