package Ex_04_IfElseFor;

import java.util.Scanner;

public class Lab009_GradeCalculator {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grades");
        int grades = scanner.nextInt();

        if (0<=grades && grades<=59){
            System.out.printf("Grade 'F' with score %d%n", grades);
        } else if (60<=grades && grades<=69){
            System.out.printf("Grade 'D' with score %d%n", grades);
        } else if (70<=grades && grades<=79){
            System.out.printf("Grade 'C' with score %d%n", grades);
        } else if (80<=grades && grades<=89){
            System.out.printf("Grade 'B' with score %d%n", grades);
        } else if (90<=grades && grades<=100){
            System.out.printf("Grade 'A' with score %d%n", grades);
        } else {
            System.out.printf("Invalid grades %d%n", grades);
        }
    }
}
