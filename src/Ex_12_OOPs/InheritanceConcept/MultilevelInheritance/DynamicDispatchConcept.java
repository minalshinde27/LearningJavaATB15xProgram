package Ex_12_OOPs.InheritanceConcept.MultilevelInheritance;

public class DynamicDispatchConcept {
    public static void main(String[] args) {

        /*
        1.Dynamic dispatch refers to the object creation of one class having
        reference from another class which are linked to each other
        2.Created object will have access to the reference class properties only;
        it won't be having access to its own class */

        Grandfather gf01 = new Father();
        gf01.grandfatherHome();
        System.out.println(gf01.grandfatherGold);
        //gf01.fatherHome();

        Father f01 = new Son();
        f01.fatherHome();
        System.out.println(f01.fatherCash);
        f01.grandfatherHome();
        System.out.println(f01.grandfatherGold);
        //f01.myHome();

        /*
        1.Cannot have dynamic dispatch between classes that are not directly linked
        2.Cannot have dymanic dispatch with child class as reference and parent class as object
         */

        //Son s01 = new Grandfather();
        //Son s02 = new Father();

        /*
        When both classes have same name properties;
        created object refers to the object class methods and reference class attributes
         */
        gf01.sayHello();                //Method from object class i.e. Father
        System.out.println(gf01.name);  //Attribute from reference class i.e. Grandfather

    }
}
