package Ex_12_OOPs.InheritanceConcept.MultilevelInheritance;

public class Father extends Grandfather{
    void fatherHome(){
        System.out.println("Father's home");
    }

    String fatherCash = "100K";

    String name = "Father";

    void sayHello(){
        System.out.println("Hello");
    }
}
