package Ex_03_IncrementDecrement;

public class Lab040_ComplexExamples {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        //  A -> a++ ->  A=10, a = 11
        // +
        // B -> a ->  11
        // A+B
        // 10 + 11

        int b = 10;
        System.out.println(b++ + ++b);
        System.out.println(b);

        int c = 10;
        System.out.println(++c + ++c);
        System.out.println(c);

        int d = 10;
        int result_post = d--;
        System.out.println(result_post); // 10
        System.out.println(d); //9

        int x = 10;
        int y = x++ + ++x + --x + x--;  //10+12+11+11
        System.out.println(y);
    }
}
