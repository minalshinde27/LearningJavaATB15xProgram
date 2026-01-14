package Ex_10_String;

public class Lab060_StringFunctions {
    public static void main (String[] args){

        String name = "Pramod";
        boolean result = name.contains("m");
        System.out.println(result);

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));

        String name1 = "pramod";
        name1 = name1.toUpperCase();
        System.out.println(name1);


    }
}
