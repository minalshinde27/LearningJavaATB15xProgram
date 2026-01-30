package Ex_12_OOPs.Lab093_AccessModifiers.Pack1;

public class Class1Pack1 {

    //'public' members are accessible from anywhere
    public String publicAttributeClass1 = "publicAttributeClass1";
    public void publicMethodClass1 () {
        System.out.println("Public method in pack1");
    }

    //'private' members are accessible only within the same class
    private String privateAttributeClass1 = "privateAttributeClass1";
    private void privateMethodClass1 (){
        System.out.println("Private method in pack1");
    }

    /*'protected' members are accessible only within package and subclasses outside package
    In subclass, to access 'protected' members need to create object of subclass
    */
    protected String protectedAttributeClass1 = "protectedAttributeClass1";
    protected void protectedMethodClass1(){
        System.out.println("Protected method in pack1");
    }

    //'default' members are accessible only within package
    String defaultAttributeClass1 = "defaultAttributeClass1";
    void defaultMethodClass1(){
        System.out.println("Default method in pack1");
    }
}
