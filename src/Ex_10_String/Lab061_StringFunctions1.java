package Ex_10_String;

public class Lab061_StringFunctions1 {
    public static void main (String[] args){

        String s= "Java";
        char c = s.charAt(2);
        System.out.println(c);

        //Compares ASCII value of first char
        int result = "ABC".compareTo("abc");
        int result1 = "abc".compareTo("abc");
        int result2 = "abc".compareTo("ABC");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        int idx = "Java".indexOf("a"); // 1 (first appearance index)
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // 3 (last appearance index)
        System.out.println(idx2);

        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("*", "Java", "Python"); //Java*Python
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // Jovo
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

        String s13 = "Java".concat("Mava"); // JavaMava
        System.out.println(s13);

        boolean b11 = "Java".endsWith("v"); // false
        System.out.println(b11);

        String name3 = "    Sonal Harish     "; //removes spaces
        System.out.println(name3.trim());
    }
}
