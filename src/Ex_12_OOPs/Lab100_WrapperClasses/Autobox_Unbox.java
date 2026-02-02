package Ex_12_OOPs.Lab100_WrapperClasses;

public class Autobox_Unbox {
    public static void main() {

        //Autobox - Convert primitive to wrapper - automatic by JVM
        int a = 10;
        Integer aa = a;     //Got attributes and behaviour

        //Unbox - Convert wrapper to primitive
        Integer aa1 = 100;
        int a1 = aa1;   //Lost attribute and behavior

        //String converted to wrapper to primitive
        int a2 = Integer.parseInt("123");
    }
}
