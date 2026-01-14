package Ex_10_String;

public class Lab066_StringBuilder_StringBuffer01 {
    public static void main (String[] args){

        StringBuilder sbld = new StringBuilder("Hello");
        sbld.append(" World"); // Hello World
        sbld.reverse(); // dlroW olleH
        System.out.println(sbld);


        StringBuffer sbfr = new StringBuffer("Java");
        sbfr.append(" Programming");
        System.out.println(sbfr);
        sbfr.replace(0, 4, "C++");
        System.out.println(sbfr);

    }
}
