package Ex_12_OOPs.Lab093_AccessModifiers.Pack1;

public class Class2Pack1 {
    public static void main() {
        Class1Pack1 c2p1 = new Class1Pack1();
        c2p1.publicMethodClass1();
        System.out.println(c2p1.publicAttributeClass1);

        //c2p1.privateMethodClass1();
        //System.out.println(c2p1.privateAttributeClass1);

        c2p1.protectedMethodClass1();
        System.out.println(c2p1.protectedAttributeClass1);

        c2p1.defaultMethodClass1();
        System.out.println(c2p1.defaultAttributeClass1);

    }
}
