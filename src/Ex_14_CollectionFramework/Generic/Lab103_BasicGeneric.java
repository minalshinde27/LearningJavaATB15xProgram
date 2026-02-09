package Ex_14_CollectionFramework.Generic;

public class Lab103_BasicGeneric {
    public static void main() {
        add(5,1);
        add("Test","Check");
       // add(1,"test");    Not possible as in first 2 add methods
        // we have defined the datatype which is not followed here
        add(1,"Test");
    }

    //'add' method for Integer type
    static void add(Integer a, Integer b){
        System.out.println(a+b);
    }

    //'add' method for String type
    static void add(String a, String b){
        System.out.println(a+b);
    }

    //'add' method using generic; which means data type is not fixed
    //Instead of 'G' we can have anything but should be in sync in syntax given
    static <G> G add(G a, G b){
        System.out.println(a);
        return null;
    }
}
