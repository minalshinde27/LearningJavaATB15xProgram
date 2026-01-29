package Ex_12_OOPs;

public class Lab085_ClassConcept_UsingPerson {
    public static void main() {

        //Creating object of a class
        Lab084_ClassConcept_Person p1 = new Lab084_ClassConcept_Person();
        /*
        Here Lab084_ClassConcept_Person is a Class
        p1 is object reference
        new Lab084_ClassConcept_Person() is an object
         */

        //Accessing class attributes
        p1.name = "Minal";

        //Accessing class functions
        p1.speak();

        //Objects would be identical/different though created from same class
        Lab084_ClassConcept_Person p2 = new Lab084_ClassConcept_Person();
        p2.name = "Minal";

        //Only mention of references without object refers to null area in HEAP
        Lab084_ClassConcept_Person p3;

        //Only object creation mention, creates object without reference
        new Lab084_ClassConcept_Person();

    }
}
