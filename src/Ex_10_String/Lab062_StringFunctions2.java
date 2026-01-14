package Ex_10_String;

public class Lab062_StringFunctions2 {
    public static void main (String[] args){

        CharSequence s = "Pramod";
        System.out.println(s);
        System.out.println(s.subSequence(1,4)); //Take chars from n to m-1

        String s1 = "Java".substring(2);
        System.out.println(s1); //Takes string from mentioned index

        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        boolean b = "   ".isBlank();
        boolean b1 = "".isEmpty();
        System.out.println(b);
        System.out.println(b1);

        String s2 = "ab".repeat(3); //repeat string for mentioned times
        System.out.println(s2);

        boolean b11 = "Java".equalsIgnoreCase("java"); //Check containts ignoring string case
        System.out.println(b11);

        long count = "a\nb\nc".lines().count(); //counts number of lines
        System.out.println(count);

        System.out.println("=".repeat(10));
        System.out.println("Here we got!!");
        System.out.println("=".repeat(10));

    }
}
