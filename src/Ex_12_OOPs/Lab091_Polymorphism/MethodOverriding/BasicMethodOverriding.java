package Ex_12_OOPs.Lab091_Polymorphism.MethodOverriding;

public class BasicMethodOverriding {
    public static void main() {
        Son s1 = new Son();
        s1.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Son();      //Dynamic dispatch
        f2.home();
    }
}

class Father {
    void home(){
        System.out.println("2BHK");
    }
}

class Son extends Father {
    void home(){
        System.out.println("3BHK");
    }
}
