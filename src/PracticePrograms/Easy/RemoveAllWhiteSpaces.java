package PracticePrograms.Easy;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        /*
        Write a program to remove all white spaces from a given string.
         */
        System.out.println("Start of Program...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the string");

        if(scanner.hasNext()){
            String inputString = scanner.nextLine();
            System.out.println("Received string is : "+inputString);
            inputString = inputString.replace(" ","");
            System.out.println("Updated string is : "+inputString);
        }
        else {
            System.out.println("Please provide valid string..");
            scanner.next();
        }
        System.out.println("End of Program..!");
    }
}
