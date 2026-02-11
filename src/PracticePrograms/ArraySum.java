package PracticePrograms;

import java.util.Scanner;

public class ArraySum {
    public static void main() {
        System.out.println("Start of Program");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size for 'Numbers' array");

        if (scanner.hasNextInt()){
            int arraySize = scanner.nextInt();
            int[] numberArray = new int[arraySize];

            for (int i=0; i<arraySize; i++){
                System.out.println("Provide number for "+i+" index");
                if (scanner.hasNextInt()){
                    numberArray[i] = scanner.nextInt();
                } else {
                    System.out.println("Provide valid number");
                    scanner.next();
                    i--;
                }
            }
            System.out.print("Array of numbers is : ");
            for (int number : numberArray){
                System.out.print(number+" ");
            }
            System.out.println();

            int sum = 0;
            for (int j=0; j<arraySize; j++){
                sum = sum + numberArray[j];
            }
            System.out.println("Sum of Array elements is : "+sum);

        } else {
            System.out.println("Provide valid numeric size for 'Numbers' array");
        }
        System.out.println("End of Program");
    }
}
