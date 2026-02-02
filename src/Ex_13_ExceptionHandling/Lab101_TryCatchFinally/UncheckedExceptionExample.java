package Ex_13_ExceptionHandling.Lab101_TryCatchFinally;

public class UncheckedExceptionExample {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = 10/a;

        /*
        Here line no. 6 throws below exceptions after running the program
        1.When no input given in args : ArrayIndexOutOfBoundsException
        2.When provided 0 as input in args : ArithmeticException
        As these exceptions occur after running the program; they are referred as
        Unchecked Exceptions
         */
    }
}
