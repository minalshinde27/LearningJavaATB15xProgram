package Test_JavaCoding_11Jan2026;

import java.util.Scanner;

public class ArithmaticOperator_EvenOddNumbers {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        }
        else {
            System.out.println("Provide valid integer");
            System.exit(0);
        }

        scanner.close();
    }
}
