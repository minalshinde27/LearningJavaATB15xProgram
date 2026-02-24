package PracticePrograms.Easy;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        /*
        Determine whether an integer is a palindrome without converting it to a string.
         */
        System.out.println("Start of program..");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a number to check Palindrome property");
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println("Received number is : "+number);

            if(number<0 || (number%10 ==0 && number != 0)){
                System.out.println("Given number "+number+" is not a Palindrome");
            }
            else {
                int original = number;
                int reversed = 0;

                while(number>0){
                    int lastDigit = number%10;
                    reversed = (reversed*10)+lastDigit;
                    number=number/10;
                }
                if(reversed==original){
                    System.out.println("Given number "+original+" is a Palindrome");
                } else {
                    System.out.println("Given number "+original+" is not a Palindrome");
                }
            }

        }
        else {
            System.out.println("Provide valid integer");
            scanner.next();
        }

        System.out.println("End of program..!");
    }
}
