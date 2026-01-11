package Test_JavaCoding_11Jan2026;

import java.util.Scanner;

public class ReverseANumber {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a valid integer number");
        if (scanner.hasNextInt()){
            int number = scanner.nextInt();

            int originalNum = number;
            int reversedNum = 0;

            do {
                int lastDigit = number % 10;      // Get the last digit
                reversedNum = reversedNum * 10 + lastDigit; // Shift and add
                number = number / 10;             // Remove the last digit
            }
            while (number!=0);

            System.out.println("Original Number is "+originalNum);
            System.out.println("Reversed Number is "+reversedNum);
        }
        else {
            System.out.println("Provide valid integer");
            System.exit(0);
        }
    }
}
