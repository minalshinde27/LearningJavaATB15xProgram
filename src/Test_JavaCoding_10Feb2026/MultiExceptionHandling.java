package Test_JavaCoding_10Feb2026;

import java.util.Scanner;

public class MultiExceptionHandling {
    public static void main(String[] args) {
        int a = 30;
        int b = 0;
        int result = 0;
        try {
            b = Integer.parseInt(args[0]);
            result = a/b;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }
    }
}

//ArrayIndexOutOfBoundsException
//ArithmeticException
//NumberFormatException