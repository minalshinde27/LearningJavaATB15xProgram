package PracticePrograms.Easy;

import java.util.Scanner;

public class FindSmallestElementInArray {
    public static void main(String[] args) {
        /*
        Find and print the smallest element in an array of integers.
         */
        System.out.println("Start the program..");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide size of array");
        if(scanner.hasNextInt()){
            int arraySize = scanner.nextInt();
            System.out.println("Received array size is "+arraySize);

            int[] numberArray = new int[arraySize];

            for(int i=0; i<arraySize; i++){
                System.out.println("Provide element at position "+i);
                if(scanner.hasNextInt()){
                    numberArray[i] = scanner.nextInt();
                }
                else {
                    System.out.println("Provide valid integer element");
                    scanner.next();
                    i--;
                }
            }

            System.out.println("Received number array is : ");
            for(int i : numberArray){
                System.out.print(i+" ");
            }
            System.out.println();

            int min=numberArray[0];
            for(int i=0; i<arraySize; i++){
                if(numberArray[i]<min){
                    min = numberArray[i];
                }
            }
            System.out.println("Minimum number in array is "+min);

        }
        else {
            System.out.println("Provide valid integer for array size");
        }
        System.out.println("End of Program..!");
    }
}
