package Ex_12_OOPs;

public class Lab094_SuperKeyword {
    public static void main() {
        Ertiga e = new Ertiga();
        e.drive();
    }
}

class Car1 {
    void startCar(){
        System.out.println("Start Car");
    }
    void stopCar(){
        System.out.println("Stop Car");
    }
}

class Ertiga extends Car1 {
    String carModel = "TopModel";
    void drive(){
        super.startCar();       //'super' keyword is used to refer immediate parent members
        System.out.println("My car model is "+this.carModel);   //'this' keyword is used to refer current instance members
        super.stopCar();
    }
}
