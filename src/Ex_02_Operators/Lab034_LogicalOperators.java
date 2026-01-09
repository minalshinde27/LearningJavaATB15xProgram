package Ex_02_Operators;

public class Lab034_LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c= true || false;
        System.out.println(c);

        boolean c1= false && true;
        System.out.println(c1);

        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true);  // True
        System.out.println(false || false); // False

        //  And  && // only true && true returns true
        // T || T -> T ->
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False

    }
}
