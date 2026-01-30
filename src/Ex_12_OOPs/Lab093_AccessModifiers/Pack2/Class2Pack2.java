package Ex_12_OOPs.Lab093_AccessModifiers.Pack2;

import Ex_12_OOPs.Lab093_AccessModifiers.Pack1.Class1Pack1;

public class Class2Pack2 extends Class1Pack1 {
    public static void main() {
        Class2Pack2 c2p2 = new Class2Pack2();
        c2p2.protectedMethodClass1();
        System.out.println(c2p2.protectedAttributeClass1);

        //c2p2.defaultMethodClass1();
        //System.out.println(defaultAttributeClass1);

    }
}
