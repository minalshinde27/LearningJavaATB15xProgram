package Ex_13_ExceptionHandling.Lab101_TryCatchFinally;

public class CombiningMultipleTryCatch {
    public static void main(String[] args) {

        System.out.println("Start of Program");

        try {
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of Program");
    }
}
