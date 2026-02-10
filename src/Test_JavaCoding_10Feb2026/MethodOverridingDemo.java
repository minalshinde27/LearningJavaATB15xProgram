package Test_JavaCoding_10Feb2026;

public class MethodOverridingDemo {
    public static void main() {
        Parent p = new Parent();
        p.display();
        Child c = new Child();
        c.display();
    }
}

class Parent {
    public void display(){
        System.out.print("Parent class display method ");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.print("Child class display method ");
    }
}
