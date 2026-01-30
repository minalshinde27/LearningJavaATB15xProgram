package Ex_12_OOPs.Lab093_AccessModifiers.Pack2;

import Ex_12_OOPs.Lab093_AccessModifiers.Pack1.Class1Pack1;

public class Class1Pack2 {
public static void main() {
    Class1Pack1 c1p1 = new Class1Pack1();
    System.out.println(c1p1.publicAttributeClass1);
    c1p1.publicMethodClass1();

    //System.out.println(c1p1.privateAttributeClass1);
    //c1p1.privateMethodClass1();

    //System.out.println(c1p1.protectedAttributeClass1);
    //c1p1.protectedMethodClass1();
}
}
