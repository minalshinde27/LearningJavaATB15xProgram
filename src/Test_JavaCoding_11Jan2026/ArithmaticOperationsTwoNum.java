package Test_JavaCoding_11Jan2026;

import java.util.Scanner;

public class ArithmaticOperationsTwoNum {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");

        if (scanner.hasNextInt()) {
        int num1 = scanner.nextInt();

        System.out.println("Enter second number");
        if (scanner.hasNextInt()) {
        int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.printf("%d + %d = %d%n", num1, num2, sum);

            int sub = num1 - num2;
            System.out.printf("%d - %d = %d%n", num1, num2, sub);

            int mul = num1 * num2;
            System.out.printf("%d * %d = %d%n", num1, num2, mul);

            int div;
            if (num2 == 0) {
                throw new ArithmeticException("Division by 0 is not allowed");
            } else {
                div = num1 / num2;
                System.out.printf("%d / %d = %d%n", num1, num2, div);
            }

            int mod = num1 % num2;
            System.out.printf("%d mod %d = %d%n", num1, num2, mod);
        }
        else {
            System.out.println("Enter valid integer");
            System.exit(0);
        }}
        else {
                System.out.println("Enter valid integer");
                System.exit(0);
            }

        scanner.close();

        }
    }
