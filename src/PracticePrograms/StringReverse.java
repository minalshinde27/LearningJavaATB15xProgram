package PracticePrograms;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        /*
        Write a Java program to reverse a given string.
         */
        System.out.println("Start of Program...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide valid string");

        if(scanner.hasNext()){
            String inputString = scanner.next();
            System.out.println("Provided string is : "+inputString);

            System.out.print("Reversed string is : ");
            for(int i=inputString.length()-1; i>=0; i--){
                System.out.print(inputString.charAt(i));
            }
        }
        else {
            System.out.println("Please provide valid String");
        }
        System.out.println();
        System.out.println("End of Program..!");
    }
}
