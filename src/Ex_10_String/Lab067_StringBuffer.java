package Ex_10_String;

public class Lab067_StringBuffer {
    public static void main (String[] args){

        StringBuffer sbfr = new StringBuffer("Hello");
        System.out.println(sbfr);

        sbfr.append(" World");      //Adds text at the end
        System.out.println(sbfr);

        sbfr.insert(8, "New");  //Inserts text at n-1 as counting starts from 0
        System.out.println(sbfr);

        sbfr.replace(6, 11, "Test");    //Replace substring with given position n to m-1
        System.out.println(sbfr);

        sbfr.delete(2,5);       //Deletes substring n to m-1
        System.out.println(sbfr);

        System.out.println(sbfr.reverse()); //Reverse the string

        System.out.println(sbfr.charAt(6)); //Returns character at specifc index

        System.out.println(sbfr.length()); //Returns length of string

        System.out.println(sbfr.substring(6)); //Extract substring from mentioned position

        System.out.println(sbfr.substring(4,7));    //Extracts substring from n to m-1

        String str = sbfr.toString();   //Converts StringBuffer to String
        System.out.println(str);

    }
}
