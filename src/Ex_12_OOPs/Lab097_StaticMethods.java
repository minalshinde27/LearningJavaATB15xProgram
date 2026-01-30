package Ex_12_OOPs;

public class Lab097_StaticMethods {
    static void staticMethod(){
        System.out.println("StaticMethod");
    }
    void nonstaticMethod(){
        System.out.println("NonStaticMethod");
    }

    public static void main() {
        staticMethod();
       // nonstaticMethod();

        Class01.staticMethodClass01();

        Class01 cl01 = new Class01();
        cl01.nonstaticMethodClass01();

        Lab097_StaticMethods c001 = new Lab097_StaticMethods();
        c001.checkNonstaticMethod();
    }
    void checkNonstaticMethod(){
        staticMethod();
        nonstaticMethod();
    }
}

class Class01 {
    public static void staticMethodClass01(){
        System.out.println("StaticMethodClass01");
    }
    public void nonstaticMethodClass01(){
        System.out.println("NonStaticMethodClass01");
    }
}
