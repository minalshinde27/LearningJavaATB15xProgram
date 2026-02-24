package PracticePrograms.Easy;

import java.util.Scanner;

public class HowToTakeInputFromUsers {
    public static void main(String[] args) {
        /*
        Write a Java program that takes a name as input
        and greets the user with 'Hello, [name]!'.
         */

        System.out.println("Start the program..");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide user name");
        if(scanner.hasNext()){
            String name = scanner.next();
            System.out.println("Hello, "+name+"!");
        }
        else {
            System.out.println("Provide valid string for user name");
        }
    }
}
