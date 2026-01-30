package Ex_11_Arrays;

import java.util.Scanner;

public class Lab083_PyramidPattern {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of stars for Pyramid");
        int number = scanner.nextInt();

        for(int row=1; row<=number; row++){
            for(int space=1; space<=number-row; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=row; star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
