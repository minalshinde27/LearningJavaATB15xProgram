package Ex_14_CollectionFramework.Generic;

public class GenericClass {
    public static void main() {
        Test<Integer> t1 = new Test<>(5);
        System.out.println(t1.obj + t1.getObj());
        Test<String> t2 = new Test<>("Testing");
        System.out.println(t2.obj + t2.getObj());
        Test<Double> t3 = new Test<>(2.4);
        System.out.println(t3.obj + t3.getObj());
    }
}

class Test <T> {
    T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }
}
