package Ex_12_OOPs.Lab091_Polymorphism.MethodOverloading;

public class BasicMethodOverloading {
    public static void main() {
        MathOperations m1 = new MathOperations();
        System.out.println(m1.add(24,51));
        System.out.println(m1.add(505.5,67));
        System.out.println(m1.add(4,6,8));
        System.out.println(m1.add("Test","Math"));
    }
}

class MathOperations {

    //Same method name with differenet return type/params
    int add (int a, int b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }
    double add (double a, int b){
        return a+b;
    }
    String add (String a, String b){
        return a+b;
    }
}
