package PracticePrograms.Easy;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        /*
        Write a program to check if a given year is a leap year. A leap year is divisible
         by 4, except for century years which must be divisible by 400.
         */
        System.out.println("Start the Program...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to validate");

        if(scanner.hasNextInt()){
            int inputYear = scanner.nextInt();
            if(inputYear%100==0){
                System.out.println(inputYear+" : It's a leap year");
            } else if(inputYear%4==0){
                System.out.println(inputYear+" : It's a leap year");
            } else {
                System.out.println(inputYear+" : It's not a leap year");
            }
        }
        else {
            System.out.println("Provide valid year");
            scanner.next();
        }

        System.out.println("End of the Program..!");
    }
}
