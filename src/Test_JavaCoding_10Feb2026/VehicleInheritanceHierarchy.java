package Test_JavaCoding_10Feb2026;

public class VehicleInheritanceHierarchy {
    public static void main() {

        Vehicle[] vehicles = {new Car(), new Bike()};
        for (Vehicle v : vehicles){
            v.start();
        }
    }
}

class Vehicle {
    public void start(){
        System.out.print("Vehicle start sound");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.print("Car engine starts with a roar! ");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.print("Bike engine starts with a purr! ");
    }
}


