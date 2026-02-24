package PracticePrograms.Easy;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main() {
        /*
        Create a simple calculator that performs basic arithmetic operations (+, -, *, /)
         on two numbers.
Input Format: Two numbers and an operator (+, -, *, /)
Output Format: Result of the operation
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1");

        if (scanner.hasNextInt()){
        int number1 = scanner.nextInt();

            System.out.println("Enter number2");

            if(scanner.hasNextInt()){
            int number2 = scanner.nextInt();

                System.out.println("Enter operator from +, -, *, /");

                if (scanner.hasNext()){
                    String operator = scanner.next();

                    if (operator.equals("+") || operator.equals("-") ||
                            operator.equals("*") || operator.equals("/")){
                    switch (operator) {
                        case "+" :
                            System.out.printf("Addition of two numbers %d, %d is %d",number1, number2, number1+number2);
                            break;
                        case "-" :
                            System.out.printf("Addition of two numbers %d, %d is %d",number1, number2, number1-number2);
                            break;
                        case "*" :
                            System.out.printf("Addition of two numbers %d, %d is %d",number1, number2, number1*number2);
                            break;
                        case "/" :
                            if (number2!=0)
                            {System.out.printf("Addition of two numbers %d, %d is %d",number1, number2, number1/number2);}
                            else {
                                System.out.println("Division by 0 is not allowed");}
                            break;
                        default :
                            System.out.println("Unknown operator");
                    }

                }
                else {
                    System.out.println("Provide valid operator from +, -, *, /");
                }
            }
        }
            else {
                System.out.println("Provide valid integer as Number2");
            }
    }
        else {
            System.out.println("Provide valid integer as number1");
        }
        System.out.println();
        System.out.println("End of Program");
}
}
