package PracticePrograms.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {
        /*
        Sort and print the array elements in ascending order.
         */
        System.out.println("Start of Program...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");

        if(scanner.hasNextInt()){
            int arraySize = scanner.nextInt();
            int[] numberArray = new int[arraySize];
            System.out.println("Size of array is : "+arraySize);

            for(int i=0; i<arraySize; i++){
                System.out.println("Enter element at position "+i);

                if(scanner.hasNextInt()){
                    numberArray[i] = scanner.nextInt();
                }
                else {
                    System.out.println("Provide valid integer element");
                    scanner.next();
                    i--;
                }
            }
            System.out.print("Received array is : ");

            for(int e : numberArray){
                System.out.print(e+" ");
            }
            System.out.println();

            int[] ascendSortedArray = new int[arraySize];
            int max=0;

            System.out.print("Ascending sorted array is : ");

            //Using Arrays.sort easy way
            Arrays.sort(numberArray);
            for(int n : numberArray){
                System.out.print(n+" ");
            }
            System.out.println();

            System.out.print("Ascending sorted array is : ");
            //Using logical way
            for(int i=0; i<arraySize; i++){
                for(int j=i+1; j<arraySize; j++){
                    if(numberArray[i] > numberArray[j]){
                        int temp = numberArray[i];
                        numberArray[i] = numberArray[j];
                        numberArray[j] = temp;
                    }
                }
            }
            for(int n : numberArray){
                System.out.print(n+" ");
            }
        }
        else {
            System.out.println("Provide valid value for size of array");
        }

        System.out.println();
        System.out.println("End of Program..!");
    }
}
