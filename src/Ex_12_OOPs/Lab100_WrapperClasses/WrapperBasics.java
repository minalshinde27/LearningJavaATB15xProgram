package Ex_12_OOPs.Lab100_WrapperClasses;

public class WrapperBasics {
    public static void main() {

        //Old way to declare attribute using primitive data type
        int a = 10;
        //System.out.println(a.);   No methods to use

        //New effecient way to declare attribute using wrapper classes
        Integer aa = 10;
        System.out.println(aa.byteValue());
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //Wrapper class can have null values but not primitive
        //int x = null;
        Integer y = null;
    }
}
