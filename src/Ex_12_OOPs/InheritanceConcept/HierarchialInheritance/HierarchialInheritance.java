package Ex_12_OOPs.InheritanceConcept.HierarchialInheritance;

public class HierarchialInheritance {

    public static void main() {
        //Parent class has access to its own class properties
        Father f1 = new Father();
        f1.fatherHome();
        System.out.println(f1.fatherCash);
        //f1.son1Home();
        //System.out.println(f1.son2Funds);


        //Child classes has access to parent class but not to each others properties
        Son1 s1 = new Son1();
        s1.fatherHome();
        System.out.println(s1.fatherCash);
        s1.son1Home();
        System.out.println(s1.son1Funds);
        //s1.son2Home();

        Son2 s2 = new Son2();
        s2.fatherHome();
        System.out.println(s2.fatherCash);
        s2.son2Home();
        System.out.println(s2.son2Funds);
       // System.out.println(s2.son1Funds);

    }
}
