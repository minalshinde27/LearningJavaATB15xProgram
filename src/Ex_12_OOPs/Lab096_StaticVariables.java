package Ex_12_OOPs;

public class Lab096_StaticVariables {

    int nonstaticInt1 = 10;
    String nonstaticString1 = "NonStaticString1";

    static int staticInt1 = 101;
    static String staticString1 = "StaticString1";

    //Nonstatic members cannot be referenced through static context
    public static void main() {
        //System.out.println(nonstaticInt1);
        //System.out.println(nonstaticString1);
        System.out.println(staticInt1);
        System.out.println(staticString1);

        //To access static-nonstatic variables from other class
        System.out.println(OtherClass.staticInt2);
        System.out.println(OtherClass.staticString2);

        OtherClass oc1 = new OtherClass();
        System.out.println(oc1.nonstaticInt2);
        System.out.println(oc1.nonstaticString2);

        Lab096_StaticVariables obj = new Lab096_StaticVariables();
        obj.checkNonstaticVariables();

    }
    //Nonstatic members can be referenced through nonstatic context
    void checkNonstaticVariables() {
            System.out.println(nonstaticInt1);
            System.out.println(nonstaticString1);
            System.out.println(staticInt1);
            System.out.println(staticString1);
    }

}

class OtherClass {
    public int nonstaticInt2 = 20;
    public String nonstaticString2 = "NonStaticString2";

    public static int staticInt2 = 201;
    public static String staticString2 = "StaticString2";
}