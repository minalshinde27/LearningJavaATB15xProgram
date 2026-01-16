package Ex_10_String;

import java.util.Scanner;

public class Lab068_Palindrome {
    public static void main (String[] args){

        //Palindrome means reverse of a value is same as original

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String original = scanner.next();

        String reversed = "";

        for (int i=original.length()-1; i>=0; i--){
            reversed = reversed+original.charAt(i);
        }
        if (original.equalsIgnoreCase(reversed)) {
            System.out.printf("Input string %s is Palindrome",original);
        } else {
            System.out.printf("Input string %s is NOT Palindrome",original);
        }
    }
}
