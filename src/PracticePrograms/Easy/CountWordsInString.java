package PracticePrograms.Easy;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        /*
        Write a program to count the number of words in a given string.
         */
        System.out.println("Start the Program...");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        if(scanner.hasNext()){
            String inputString = scanner.nextLine();
            System.out.println("Received String is : "+inputString);

            String[] inputStringWords = inputString.split(" ");
            System.out.print("Words in the received string are : ");

            for(String word : inputStringWords){
                System.out.print(word+", ");
            }
            System.out.println();
            System.out.println("Number of words in the string is : "+inputStringWords.length);
        }
        else {
            System.out.println("Provide valid string..");
            scanner.next();
        }

        System.out.println();
        System.out.println("End of Program..!");
    }
}
