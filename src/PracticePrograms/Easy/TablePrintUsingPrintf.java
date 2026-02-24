package PracticePrograms.Easy;

import java.util.Scanner;

public class TablePrintUsingPrintf {
    public static void main(String[] args) {
        /*
        Write a Java program that prints a multiplication table for a given number
        using printf formatting.
         */
        System.out.println("Start of program..");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide number whose table needs to be printed");

        if(scanner.hasNextInt()){
            int number = scanner.nextInt();

            System.out.println("Table for number "+number+" is :");

            for(int i=1; i<=10; i++){
                System.out.printf("%d * %d = %d", number,i,number*i);
                System.out.println();
            }
        }
        else {
            System.out.println("Provide valid integer to print table");
            scanner.next();
        }

        System.out.println("End of program..!");
    }
}
