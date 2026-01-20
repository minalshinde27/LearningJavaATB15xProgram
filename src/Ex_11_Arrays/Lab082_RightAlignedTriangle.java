package Ex_11_Arrays;

import java.util.Scanner;

public class Lab082_RightAlignedTriangle {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of N");
        int n = scanner.nextInt();

        for (int i =0; i<n; i++){
            for (int space=0; space<n-i-1; space++){
                System.out.print(" ");
            }
            for (int star=0; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
