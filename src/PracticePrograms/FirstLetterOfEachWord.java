package PracticePrograms;

import java.util.Scanner;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        /*
        Extract and print the first letter of each word in a string.
         */
        System.out.println("Start of Program...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");

        if(scanner.hasNext()){
            String inputString = scanner.nextLine();
            System.out.println("Received string is : "+inputString);

            String[] stringArray = inputString.split(" ");
            System.out.println("Elements of string array are : ");

            for(String e : stringArray){
                System.out.print(e+", ");
            }

            System.out.println();

            System.out.println("First letter of each string array element is : ");
            for(String e : stringArray){
                System.out.println(e+" : "+e.charAt(0));
            }
        }
        else {
            System.out.println("Please provide valid string");
            scanner.next();
        }

        System.out.println("End of Program..!");
    }
}
