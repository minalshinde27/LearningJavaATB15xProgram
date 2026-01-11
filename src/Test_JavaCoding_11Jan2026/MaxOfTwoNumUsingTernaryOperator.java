package Test_JavaCoding_11Jan2026;

import java.util.Scanner;

public class MaxOfTwoNumUsingTernaryOperator {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        if(scanner.hasNextInt()){
            int num1 = scanner.nextInt();

            System.out.println("Enter second number");
            if (scanner.hasNextInt()){
                int num2 = scanner.nextInt();

                int max = (num1>num2) ? num1 : num2;
                System.out.printf("Maximum number of %d and %d is %d", num1, num2, max);
            }
            else {
                System.out.println("Enter valid integer");
                System.exit(0);
            }
        }
        else {
            System.out.println("Enter valid integer");
            System.exit(0);
        }
    }
}
