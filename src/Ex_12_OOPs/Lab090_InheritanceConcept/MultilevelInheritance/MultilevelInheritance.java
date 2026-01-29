package Ex_12_OOPs.Lab090_InheritanceConcept.MultilevelInheritance;

public class MultilevelInheritance {
    public static void main() {

        //Top parent class has access to only its own properties
        Grandfather gf1 = new Grandfather();
        gf1.grandfatherHome();
        System.out.println(gf1.grandfatherGold);
        //gf1.myHome();
        //gf1.fatherHome();


        //Middle level class has access to its upward parent classes and its own properties
        Father f1 = new Father();
        f1.grandfatherHome();
        System.out.println(f1.grandfatherGold);
        f1.fatherHome();
        System.out.println(f1.fatherCash);
        //f1.myHome();

        //Last level child class has access to all upward parent classes and his own properties
        Son s1 = new Son();
        s1.grandfatherHome();
        System.out.println(s1.grandfatherGold);
        s1.fatherHome();
        System.out.println(s1.fatherCash);
        s1.myHome();
        System.out.println(s1.myFunds);

    }
}
