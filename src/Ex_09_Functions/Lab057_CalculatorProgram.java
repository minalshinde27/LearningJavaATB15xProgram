package Ex_09_Functions;

import java.util.Scanner;

public class Lab057_CalculatorProgram {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1 = readInt(scanner, "Enter valid integer");
        int num2 = readInt(scanner, "Enter valid integer");

        int sum = sumOfNumbers(num1,num2);
        System.out.println("Sum of numbers is "+sum);

        int sub = subOfNumbers(num1,num2);
        System.out.println("Sub of numbers is "+sub);

        int mul = mulOfNumbers(num1,num2);
        System.out.println("Mul of numbers is "+mul);

        int div = divOfNumbers(num1,num2);
        System.out.println("Div of numbers is "+div);

        scanner.close();
    }

    static int readInt (Scanner scanner, String prompt){
        System.out.println(prompt);
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else {
            System.out.println("Invalid input");
            System.exit(0);
            return 0;
        }
    }

    static int sumOfNumbers (int x, int y){
        return x+y;
    }

    static int subOfNumbers (int x, int y){
        return x-y;
    }

    static int mulOfNumbers (int x, int y){
        return x*y;
    }

    static int divOfNumbers (int x, int y){
        if(y==0){
            throw new ArithmeticException("Division by 0 is not allowed");
        }
        else {
            return x/y;
        }
    }

}
