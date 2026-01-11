package Test_JavaCoding_11Jan2026;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        if(scanner.hasNextInt()){
            int num1 = scanner.nextInt();

            System.out.println("Enter second number");
            if(scanner.hasNextInt()){
                int num2 = scanner.nextInt();

                System.out.println("Enter operation to perform from : Addition, Substraction, Multiplication or Division");
                String operation = scanner.next();
                operation = operation.toLowerCase();

                switch (operation){
                    case "addition" :
                        int result =num1+num2;
                        System.out.printf("Addition of %d and %d is %d", num1, num2, result);
                        break;
                    case "substraction" :
                        int result1 =num1-num2;
                        System.out.printf("Substraction of %d and %d is %d", num1, num2, result1);
                        break;
                    case "multiplication" :
                        int result2 =num1*num2;
                        System.out.printf("Multiplication of %d and %d is %d", num1, num2, result2);
                        break;
                    case "division" :
                        int result3 =num1/num2;
                        System.out.printf("Division of %d and %d is %d", num1, num2, result3);
                        break;
                    default :
                        System.out.println("Provide valid operation : Addition, Substraction, Multiplication or Division");
                }

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
