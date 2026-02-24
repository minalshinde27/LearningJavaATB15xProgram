package PracticePrograms.Easy;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main() {

        /*
        Write a Java program that reads two integers from input and prints their sum.

Input Format: Two integers separated by a space
Output Format: A single integer representing the sum
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        if(scanner.hasNextInt()){
            int number1 = scanner.nextInt();

            System.out.println("Enter second number");
            if(scanner.hasNextInt()){
                int number2 = scanner.nextInt();

                int sum = number1+number2;
                System.out.printf("Sum of given two numbers %d, %d is %d", number1, number2, sum);
                System.out.println();
            }
            else {
                System.out.println("Provide valid integer as Number2");
            }
        }
        else {
            System.out.println("Enter valid integer as Number1");
        }
        System.out.println("End of Program!");
    }
}
