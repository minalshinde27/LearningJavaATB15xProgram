package Ex_12_OOPs.Lab093_AccessModifiers.Pack1;

public class Class3Pack1 extends Class1Pack1{
    public static void main() {
        Class1Pack1 c3p1 = new Class1Pack1();
        c3p1.publicMethodClass1();
        System.out.println(c3p1.publicAttributeClass1);

        c3p1.protectedMethodClass1();
        System.out.println(c3p1.protectedAttributeClass1);

        c3p1.defaultMethodClass1();
        System.out.println(c3p1.defaultAttributeClass1);
    }
}
