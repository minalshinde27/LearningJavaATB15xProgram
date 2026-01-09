package Ex_02_Operators;

public class Lab030_OperatorsBasics {
    public static void main(String[] args) {
        int age = 10;
        // Assignment operator
        // int -> data type
        // age -> identifier
        // = -> Assignment operator
        // 10 -> Literal

        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

    System.out.println(first_name + last_name + a + b);
       System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));

        // First of all, whenever it sees strings,
        // it will do concatenation, and for the next
        // one also it will also do concatenation.
        // But when it sees integers first, it will do mathematical operation.
        // The second time it will see strings,
        // then it will do concatenation as well.

        // BODMAS - Bracket of Div, mul, add, sub
        System.out.println((9 * 3 / 9 + 1) * 3);

    }
}
