package PracticePrograms.Easy;

import java.util.Scanner;

public class FindMaximumInArray {
    public static void main() {

        /*
        Find and print the maximum element in an array of integers.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array");
        if(scanner.hasNextInt()){
            int sizeOfArray = scanner.nextInt();
            System.out.println("Size of array is "+sizeOfArray);

            int[] array = new int[sizeOfArray];

            for(int i=0; i<sizeOfArray; i++){
                System.out.println("Enter array element at "+i+" position");
                if(scanner.hasNextInt()){
                    int element = scanner.nextInt();
                    array[i]=element;
                }
                else {
                    System.out.println("Enter valid integer as array element");
                    scanner.next();
                    i--;
                }
            }

            System.out.print("Array elements are : ");
            for(int arr : array){
                System.out.print(arr+" ");
            }
            System.out.println();

            int max=0;
            for(int j=0; j<sizeOfArray; j++){
                if(array[j]>max){
                    max=array[j];
                }
            }
            System.out.println("Max element within array is "+max);
        }
        else {
            System.out.println("Provide valid integer as size of array");
        }
        System.out.println("End of Program!");
    }
}
