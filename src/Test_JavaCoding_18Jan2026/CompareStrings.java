package Test_JavaCoding_18Jan2026;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string1");
        String input1 = scanner.nextLine();
        System.out.println(input1);

        System.out.println("Enter string2");
        String input2 = scanner.nextLine();
        System.out.println(input2);

        if(input1.equalsIgnoreCase(input2)){
            System.out.println("Both string content is equal");
        } else {
            System.out.println("Both string content is NOT equal");
        }
    }
}
