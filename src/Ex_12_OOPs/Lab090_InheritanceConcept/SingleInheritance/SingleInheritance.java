package Ex_12_OOPs.Lab090_InheritanceConcept.SingleInheritance;

public class SingleInheritance {
    static void main() {

        Son s1 = new Son();
        //child class can access its own properties
        s1.myHome();
        System.out.println(s1.myFunds);
        //child class can access parent class properties as well
        s1.fatherHome();
        System.out.println(s1.fatherCash);


        Father f1 = new Father();
        //Parent class has access to its own properties only no access to child class properties
        f1.fatherHome();
        System.out.println(f1.fatherCash);
        //f1.myHome();

    }
}
