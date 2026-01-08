package Ex_05_SwitchStatements;

import java.util.Scanner;

public class Lab011_SwitchCase1 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7 for day program");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("Please enter valid number from 1 to 7");
                    break;
            }
        } else {
            System.out.println("Invalid int entered");
        }
        System.out.println("End of Program");
    }
}
