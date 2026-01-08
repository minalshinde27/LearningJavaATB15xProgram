package Ex_01_JavaBasics;

public class Lab010_mainMethod {
    public static void main (String[] args){
        System.out.println("Valid main method");
    }

//    public static void main (String[] selenium){
//        System.out.println("Valid main method");
//    }
    // The word args is just a variable name (an identifier). You can name it java, Selenium, or chips. As long as the type is String[], the JVM will recognize it.

//    public static void main (string args[]){
//        System.out.println("Valid main method");      Java is case-sensitive. It must be String (Capital S), not string. If you fix the "S", the args[] position is valid.
//    }

//    public static void main (String[]args){
//      System.out.println("Valid main method");        Spacing between the type and the variable name doesn't matter to the compiler.
//    }

//    public static void main (String...args){
//        System.out.println("Valid main method");      This is called Var-args (variable arguments). The JVM treats String... as String[].
//    }

//    static public void main (String[] args){
//        System.out.println("Valid main method");      The order of modifiers (public and static) can be swapped.
//    }

//    public void static main (String[] args){
//        System.out.println("InValid main method");    The return type (void) must come immediately before the method name (main).
//    }

//    public static main void (String[] args){
//        System.out.println("InValid main method");    The return type (void) must come immediately before the method name (main).
//   }

}
