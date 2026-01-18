package Test_JavaCoding_18Jan2026;

import java.util.Scanner;

public class CheckStringLength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string");
        String input = scanner.nextLine();
        System.out.println(input);

        int inputLength = input.length();

        if(inputLength>10){
            System.out.println("Input '"+input+"' length is greater than 10 and it is : "+inputLength);
        } else {
            System.out.println(input+" length is NOT greater than 10 and it is : "+inputLength);;
        }
    }
}
