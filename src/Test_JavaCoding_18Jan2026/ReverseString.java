package Test_JavaCoding_18Jan2026;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string");
        String input = scanner.nextLine();
        System.out.println(input);

        String reversedInput = "";

        for(int i=input.length()-1; i>=0; i--){
            reversedInput = reversedInput+input.charAt(i);
        }
        System.out.println("Reversed string is : "+reversedInput);
    }
}
