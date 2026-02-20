package PracticePrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class CountVowelsAndConsonants {
    static void main(String[] args) {
        /*
        Write a program to count the number of vowels and consonants in a given string.
         */
        System.out.println("Start of Program");

        String inputString;
        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        int numberOfOther = 0;

        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNext()){
            System.out.println("Provide string to validate");
            inputString = scanner.nextLine();
            System.out.println("Original String : "+inputString);

            inputString = inputString.toLowerCase();

            System.out.println("Converted String : "+inputString);

            for(int i=0; i<inputString.length(); i++){
                char ch = inputString.charAt(i);

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    numberOfVowels = numberOfVowels+1;
                } else if (ch>='a' && ch<='z'){
                    numberOfConsonants = numberOfConsonants+1;
                } else {
                    numberOfOther = numberOfOther+1;
                }
            }
            System.out.println("Number of vowels in provided string is : "+numberOfVowels);
            System.out.println("Number of vowels in provided string is : "+numberOfConsonants);
            System.out.println("Number of vowels in provided string is : "+numberOfOther);

        }
        else {
            System.out.println("Provide valid string as input");
        }
        System.out.println("End of Program!");
    }
}
