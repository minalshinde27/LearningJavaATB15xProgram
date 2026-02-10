package Test_JavaCoding_10Feb2026;

public class CalculatorMethodOverloading {
    public static void main() {
        Calculator c = new Calculator();
        c.add(5,3);
        c.add(2.5, 3.7);
        c.add(1,2,3);
    }
}

class Calculator {
    public void add (int a, int b){
        int result = a+b;
        System.out.print("Integer addition: "+result+" ");
    }

    public void add (double a, double b){
        double result = a+b;
        System.out.print("Double addition: "+result+" ");
    }

    public void add (int a, int b, int c){
        int result = a+b+c;
        System.out.print("Three integers addition: "+result+" ");
    }
}
