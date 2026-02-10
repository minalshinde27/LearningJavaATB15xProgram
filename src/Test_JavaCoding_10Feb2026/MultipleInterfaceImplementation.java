package Test_JavaCoding_10Feb2026;

public class MultipleInterfaceImplementation {
    public static void main() {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.print("Duck is flying in the sky! ");
    }

    @Override
    public void swim() {
        System.out.print("Duck is swimming in the water! ");
    }
}
