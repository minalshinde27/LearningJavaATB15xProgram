package Ex_13_ExceptionHandling.Lab102_Throws;

public class UsingMultipleThrows {
    public static void main(String[] args) {

        System.out.println("Program Started");
        try {
            divideByZero(Integer.parseInt(args[0]));
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());        }
        System.out.println("Program executed");
    }

    static int divideByZero (int a) throws ArithmeticException, NumberFormatException,
            ArrayIndexOutOfBoundsException {
        int b = 10/a;
        return b;
    }
}
