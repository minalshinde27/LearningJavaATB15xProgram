package PracticePrograms;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main() {

        /*
        Write a Java program that reads two integers from input and prints their sum.

Input Format: Two integers separated by a space
Output Format: A single integer representing the sum
         */

        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            int number1 = scanner.nextInt();

            if(scanner.hasNextInt()){
                int number2 = scanner.nextInt();

                System.out.println(number1+number2);
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
