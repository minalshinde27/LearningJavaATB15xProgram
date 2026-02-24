package PracticePrograms.Easy;

import java.util.Scanner;

public class FizzBuzz {
    public static void main() {
        /*
        Print numbers from 1 to n.
        For multiples of 3, print 'Fizz'.
        For multiples of 5, print 'Buzz'.
        For multiples of both 3 and 5, print 'FizzBuzz'.
Input Format: A single integer n
Output Format: Numbers 1 to n with Fizz/Buzz/FizzBuzz replacements
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for n");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if(i%3 == 0){
                System.out.println("Fizz");
            } else if (i%5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
