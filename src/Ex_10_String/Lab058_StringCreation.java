package Ex_10_String;

public class Lab058_StringCreation {
    public static void main (String[] args){

        //Two ways to create String

        //1.Using '=' operator : Gets stored in SCP (String Constant Pool)
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = "hello";
        //In SCP if value is same all objects point to same reference

        //2.Using 'new' operator : Gets stored in OA (Object Area)
        String s11 = new String("Hello");
        String s12 = new String("Hello");
        String s13 = new String("Hello");
        String s14 = new String("hello");
        //In OA though the valus is same each object point to individual reference. Always creates new reference.






    }
}
