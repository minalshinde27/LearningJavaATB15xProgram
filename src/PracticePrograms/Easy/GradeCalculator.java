package PracticePrograms.Easy;

import java.util.Scanner;

public class GradeCalculator {
    public static void main() {

        /*
        Calculate the letter grade based on a numeric score.
        A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: below 60.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score between 0-100");

        if (scanner.hasNextInt()){
            int score = scanner.nextInt();
            if (score < 60){
                System.out.printf("Grade for %d : F",score);
            } else if (score == 60 | score <= 69) {
                System.out.printf("Grade for %d : D",score);
            } else if (score == 70 | score <= 79) {
                System.out.printf("Grade for %d : C",score);
            } else if (score == 80 | score <= 89) {
                System.out.printf("Grade for %d : B",score);
            } else if (score == 90 | score <= 100) {
                System.out.printf("Grade for %d : A",score);
            } else {
                System.out.println("Enter valid numeric score 0-100");
            }
        } else {
            System.out.println("Enter valid numeric score 0-100");
        }
    }
}