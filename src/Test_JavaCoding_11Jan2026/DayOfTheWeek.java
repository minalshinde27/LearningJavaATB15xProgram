package Test_JavaCoding_11Jan2026;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number from 1 to 7");
        if (scanner.hasNextInt()){
            int num = scanner.nextInt();

            switch (num){
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Provide number between 1 to 7.");
            }
        }
        else {
            System.out.println("Input is not valid");
            System.exit(0);
        }
    }
}
