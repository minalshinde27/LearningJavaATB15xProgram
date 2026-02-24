package PracticePrograms.Easy;

import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        /*
        Print the elements of an array in reverse order.
         */
        System.out.println("Start of Program---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide size of array");

        if(scanner.hasNextInt()){
            int sizeOfArray = scanner.nextInt();

            int[] numberArray = new int[sizeOfArray];

            for (int i=0; i<sizeOfArray; i++){
                System.out.println("Provide valid integer value at position : "+i);
                if(scanner.hasNextInt()){
                    numberArray[i]= scanner.nextInt();
                }
                else {
                    System.out.println("Enter valid integer");
                    scanner.next();
                    i--;
                }
            }

            System.out.println("Received array of numbers is :");
            for(int number : numberArray){
                System.out.print(number+" ");
            }
            System.out.println();

            System.out.println("Reverse array is :");
            for(int j=sizeOfArray-1; j>=0; j--){
                System.out.print(numberArray[j]+" ");
            }
            System.out.println();
        }
        else {
            System.out.println("Provide valid integer as size of array");
        }
        System.out.println("End of Program..!");
    }
}
