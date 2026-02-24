package PracticePrograms.Easy;

import java.util.Scanner;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        /*
        Write a program to remove leading zeros from a string representation of a number.
         */
        System.out.println("Start of Program...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide valid String");

        if(scanner.hasNext()){
            String inputString = scanner.next();
            System.out.println("Provided string is : "+inputString);

            String result = inputString.replaceFirst("^0+", "");
            System.out.println("String after removing leading 0s is : "+result);
        }
        else {
            System.out.println("Please enter valid integer value");
            scanner.next();
        }
        System.out.println("End of Program..!");
    }
}
