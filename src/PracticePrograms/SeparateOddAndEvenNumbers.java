package PracticePrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddAndEvenNumbers {
    public static void main(String[] args) {
        /*
        Separate and print odd and even numbers from an array.
         */
        System.out.println("Start of program...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide size of array");

        if(scanner.hasNextInt()){
            int arraySize = scanner.nextInt();
            System.out.println("Size of array is : "+arraySize);

            int[] numberArray = new int[arraySize];

            for(int i=0; i<arraySize; i++){
                System.out.println("Provide value for element at position : "+i);

                if(scanner.hasNextInt()){
                    numberArray[i]=scanner.nextInt();
                }
                else {
                    System.out.println("Provide valid integer value");
                    scanner.next();
                    i--;
                }
            }

            System.out.print("Received array of numbers is : ");
            for(int e : numberArray){
                System.out.print(e+" ");
            }
            System.out.println();

            ArrayList<Integer> evenNumbers = new ArrayList<>();
            ArrayList<Integer> oddNumbers = new ArrayList<>();

            for(int i=0; i<arraySize; i++){
                if(numberArray[i]%2==0){
                    int even = numberArray[i];
                    evenNumbers.add(even);
                }
                else {
                    int odd = numberArray[i];
                    oddNumbers.add(odd);
                }
            }

            System.out.print("Even numbers from number array : ");
            for(int e : evenNumbers){
                System.out.print(e+" ");
            }

            System.out.println();
            System.out.print("Odd numbers from number array : ");
            for(int e : oddNumbers){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        else {
            System.out.println("Provide valid size of array");
        }
        System.out.println("End of Program..!");
    }
}
