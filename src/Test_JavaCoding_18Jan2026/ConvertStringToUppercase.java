package Test_JavaCoding_18Jan2026;

import java.util.Scanner;

public class ConvertStringToUppercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string");
        String input = scanner.nextLine();
        System.out.println(input);

        //String convertedInput = input.toUpperCase();
        System.out.println(input.toUpperCase());
    }
}
