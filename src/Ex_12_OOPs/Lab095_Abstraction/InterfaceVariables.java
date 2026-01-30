package Ex_12_OOPs.Lab095_Abstraction;

public class InterfaceVariables {
    public static void main() {
        C01 c = new C01();
        System.out.println(c.a);
        c.methodI01();
        c.methodC01();
        System.out.println(I01.a);
    }
}

/*
Interface variables are by default public static final
Interface methods are by default public abstract
 */
interface I01 {
    int a = 10;
    String nameI01 = "I01";
    void methodI01();
}

class C01 implements I01 {

    @Override
    public void methodI01() {
        System.out.println("Class Method");
    }

    int a = 100;

    void methodC01(){
        System.out.println("My Method");
        System.out.println(nameI01);
        System.out.println(a);
        System.out.println(I01.a);
    }
}