package Ex_12_OOPs;

public class Lab088_ConstructorOverloading {
    public static void main() {
        Car c1 = new Car();
        Car c2 = new Car("Ertiga","TopModel");
        Car c3 = new Car("Tesla");
        Car c4 = new Car("Spark","LT",2010);

        System.out.println(c1.name+c1.model+c1.year);
        System.out.println(c2.name+c2.model+c2.year);
        System.out.println(c3.name+c3.model+c3.year);
        System.out.println(c4.name+c4.model+c4.year);

    }
}

class Car {
    String name;
    String model;
    int year;

    //Overloading refers to having same method with different parameters
    Car(){
        System.out.println("Default Car Constructor");
    }

    Car(String carName){
        this.name = carName;
    }

    Car(String carName, String carModel){
        this.name = carName;
        this.model = carModel;
    }

    Car(String carName, String carModel, int carYear){
        this.name = carName;
        this.model = carModel;
        this.year = carYear;
    }
}