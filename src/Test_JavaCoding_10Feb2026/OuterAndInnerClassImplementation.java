package Test_JavaCoding_10Feb2026;

public class OuterAndInnerClassImplementation {
    public static void main() {
        Outer o = new Outer();
        o.outerClassMethod();
        Outer.Inner i = o.new Inner();
        i.innerClassMethod();
    }
}

class Outer {
    private int x = 10;
    public void outerClassMethod(){
        System.out.print("Outer class variable x: "+x+" ");
    }

    class Inner {
        public void innerClassMethod(){
            System.out.print("Inner class accessing outer variable: "+x+" ");
        }
    }
}

