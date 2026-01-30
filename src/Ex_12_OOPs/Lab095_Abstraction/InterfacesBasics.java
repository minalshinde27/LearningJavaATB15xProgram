package Ex_12_OOPs.Lab095_Abstraction;

public class InterfacesBasics {
    public static void main() {
        Car2 c = new Car2();
        c.drive();
    }
}

interface Engine {
    void startEngine();
    void stopEngine();
    default void testEngine1(){
        System.out.println("Concrete Default Method of Interface");
    }
    static void testEngine2(){
        System.out.println("Concrete Static Method of Interface");
    }
}

interface Brakes {
    void applyBrakes();
}

class Car2 implements Engine, Brakes {

    @Override
    public void applyBrakes() {
        System.out.println("Applying Brakes");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Engine");
    }

    String myCar = "Ertiga";
    void drive(){
        startEngine();
        testEngine1();
        Engine.testEngine2();   //To access 'static' method of interface, need to refer interface name
        applyBrakes();
        System.out.println(myCar);
        stopEngine();
    }
}